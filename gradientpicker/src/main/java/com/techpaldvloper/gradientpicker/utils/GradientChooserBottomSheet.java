package com.techpaldvloper.gradientpicker.utils;



import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.techpaldvloper.gradientpicker.R;


import java.util.List;

public class GradientChooserBottomSheet extends BottomSheetDialogFragment implements GradientAdapter.GradientClickListener{


    private GradientAdapter gradientAdapter;
    private RecyclerView premiumGradientRecyclerView;


    private String chosenPremiumGradient="orange";

    private int chosenGradientIndex=-1;

   

    private GridLayoutManager gridLayoutManager;
    




    private SharedPreferences mPref;
    private SharedPreferences.Editor editor;



    public interface PurchaseGradientsListener
    {
        void onGradientsPurchaseClicked();
    }


    private PurchaseGradientsListener purchaseGradientsListener;

    public void setPurchaseGradientsListener(PurchaseGradientsListener purchaseGradientsListener)
    {
        this.purchaseGradientsListener=purchaseGradientsListener;
    }




//    public interface ChooseGradientListener{
//        void onGradientChosen(int pos);
//    }



    private ChooseGradientListener chooseGradientListener;

    public void setChooseGradientListener(ChooseGradientListener chooseGradientListener)
    {
        this.chooseGradientListener=chooseGradientListener;
    }






    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(savedInstanceState!=null)
        {

            chosenGradientIndex=savedInstanceState.getInt("chosenGradientIndex",-1);
           

        }
        else
        {
            if(getActivity()!=null)
            {
                if (mPref == null) {
                    mPref = getActivity().getSharedPreferences("PlayMusic", Context.MODE_PRIVATE);

                    chosenGradientIndex=mPref.getInt("chosenGradientIndex",-1);

                }
            }


        }


//        setStyle(BottomSheetDialogFragment.STYLE_NORMAL, R.style.GradientBottomSheetDialogTheme);


    }


    @Nullable

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable  Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.bottom_sheet_choose_gradient,container,false);
        premiumGradientRecyclerView=view.findViewById(R.id.premium_gradient_recycler_view);
        

        gradientAdapter=new GradientAdapter(getContext());

        gridLayoutManager=new GridLayoutManager(getActivity(),4);
        premiumGradientRecyclerView.setLayoutManager(gridLayoutManager);

        gradientAdapter.submitList(GradientBuilder.getPremiumColorGradients());

        gradientAdapter.setGradientClickListener(this);

        premiumGradientRecyclerView.setAdapter(gradientAdapter);


        


        return view;
    }




    @Override
    public void onSaveInstanceState(Bundle savedInstanceState)
    {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("chosenGradientIndex",chosenGradientIndex);


    }


    @Override
    public void onResume() {
        super.onResume();

        Log.e("herr","in onresume");

        if(mPref==null&&getActivity()!=null) {
            mPref = getActivity().getSharedPreferences("PlayMusic", Context.MODE_PRIVATE);
        }

        if(mPref!=null)
        {
            chosenGradientIndex = mPref.getInt("chosenGradientIndex", -1);
            

            if (gradientAdapter != null && chosenGradientIndex != -1) {
                List<Gradient> gradientList = gradientAdapter.getCurrentList();

                if (gradientList != null && chosenGradientIndex >= 0 && chosenGradientIndex < gradientList.size()) {
                    Gradient g = gradientList.get(chosenGradientIndex);
                    g.setSelected(true);
                    Log.e("set selected", "to true");
                    gradientAdapter.notifyItemChanged(chosenGradientIndex);
                }

            }
        }


    }

    @Override
    public void onGradientClick(int pos) {

        if(gradientAdapter!=null&&chooseGradientListener!=null)
        {
            List<Gradient> gradientList=gradientAdapter.getCurrentList();

            if(gradientList!=null)
            {
                if(pos>=0&&pos<gradientList.size())
                {
                    Gradient g=gradientList.get(pos);
                    g.setSelected(true);
                    if(mPref==null&&getActivity()!=null)
                    {
                        mPref=getActivity().getSharedPreferences("PlayMusic",Context.MODE_PRIVATE);
                    }

                    if(mPref!=null)
                    {
                        editor=mPref.edit();
                        chosenGradientIndex=pos;

                        editor.putInt("chosenGradientIndex",chosenGradientIndex);

                        editor.apply();

                        if(chooseGradientListener!=null)
                        {
                            chooseGradientListener.onGradientChosen(pos);
                        }

                    }

                }

                for(int i=0;i<gradientList.size();i++)
                {
                    gradientList.get(i).setSelected(i==pos);
                    gradientAdapter.notifyItemChanged(i);
                }


            }

        }


        dismiss();



    }



    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        try {


            chooseGradientListener=(ChooseGradientListener) context;
            purchaseGradientsListener=(PurchaseGradientsListener) context;

        }catch (ClassCastException ce)
        {
            ce.printStackTrace();
        }



    }



}
