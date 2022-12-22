package com.techpaldvloper.gradientpicker.utils;


import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.techpaldvloper.gradientpicker.R;


public class GradientAdapter extends ListAdapter<Gradient, GradientAdapter.GradientHolder> {

    private Context context;


    public interface GradientClickListener{
        void onGradientClick(int pos);
    }



    private GradientClickListener gradientClickListener;

    public void setGradientClickListener(GradientClickListener gradientClickListener)
    {
        this.gradientClickListener=gradientClickListener;
    }







    public GradientAdapter(Context context)
    {
        super(DIFF_CALLBACK);
        this.context=context;
    }


    private static final DiffUtil.ItemCallback<Gradient> DIFF_CALLBACK=new DiffUtil.ItemCallback<Gradient>() {


        @Override
        public boolean areItemsTheSame(@NonNull Gradient oldItem, @NonNull Gradient newItem) {

            if(oldItem!=null&&newItem!=null&&oldItem.getName()!=null&&newItem.getName()!=null)
            {
                return oldItem.getName().equals(newItem.getName());
            }

            return false;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Gradient oldItem, @NonNull Gradient newItem) {

            boolean areContentsSame=true;

            if(oldItem!=null&&newItem!=null&&oldItem.getName()!=null&&newItem.getName()!=null)
            {
                areContentsSame=oldItem.getName().equals(newItem.getName());
            }

            if(oldItem!=null&&newItem!=null)
            {
                areContentsSame=areContentsSame&&(oldItem.isSelected()==newItem.isSelected())&&(oldItem.getStartColor()==newItem.getStartColor())&&(oldItem.getCenterColor()==newItem.getCenterColor())&&(oldItem.getEndColor()==newItem.getEndColor());

            }

            return areContentsSame;


        }
    };




    @NonNull
    @Override
    public GradientHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.gradient_item,parent,false);
        return new GradientHolder(itemView);
    }



    @Override
    public void onBindViewHolder(@NonNull GradientHolder holder, int position) {

        Gradient g=getItem(holder.getAdapterPosition());

        if(g!=null)
        {

            Log.e("here in ","on bind method");

            GradientDrawable gd=GradientBuilder.buildGradientFromColors(g.getStartColor(),g.getCenterColor(),g.getEndColor(),g.isSelected());

            if(gd!=null)
            {
                gd.setShape(GradientDrawable.OVAL);
                holder.gradientItem.setBackground(gd);
            }


        }


    }


    class GradientHolder extends RecyclerView.ViewHolder
    {

        private View gradientItem;
        public GradientHolder(@NonNull View itemView) {
            super(itemView);

            gradientItem=itemView.findViewById(R.id.gradient_item);

            gradientItem.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if(gradientClickListener!=null)
                    {
                        gradientClickListener.onGradientClick(getAdapterPosition());
                    }


                }
            });



        }
    }








}
