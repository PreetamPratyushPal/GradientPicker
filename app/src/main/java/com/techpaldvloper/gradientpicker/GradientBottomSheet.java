package com.techpaldvloper.gradientpicker;

import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.google.android.material.button.MaterialButton;
import com.techpaldvloper.gradientpicker.utils.ChooseGradientListener;
import com.techpaldvloper.gradientpicker.utils.Gradient;
import com.techpaldvloper.gradientpicker.utils.GradientBuilder;
import com.techpaldvloper.gradientpicker.utils.GradientChooserBottomSheet;

import java.util.List;

public class GradientBottomSheet extends Fragment {


    private MaterialButton bottomSheetBtn;
    private ConstraintLayout rootLayout;

    private GradientChooserBottomSheet gradientChooserBottomSheet;


    private List<Gradient> gradientList;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.gradient_fragment,container,false);

        bottomSheetBtn=view.findViewById(R.id.bottom_sheet_btn);
        rootLayout=view.findViewById(R.id.root_layout);
        gradientList= GradientBuilder.getPremiumColorGradients();

        bottomSheetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setGradientBottomSheet();
            }
        });

        return view;
    }



    public void setGradientBottomSheet()
    {
        if(getActivity()==null)
            return;
        gradientChooserBottomSheet=new GradientChooserBottomSheet();
        gradientChooserBottomSheet.setChooseGradientListener(new ChooseGradientListener() {
            @Override
            public void onGradientChosen(int pos) {

                if (pos >= 0 && pos < gradientList.size())
                {
                    Gradient g=gradientList.get(pos);
                    GradientDrawable gd=GradientBuilder.buildGradientFromColors(g.getStartColor(),g.getCenterColor(),g.getEndColor(),false);
                    rootLayout.setBackground(gd);

                }

            }
        });
        gradientChooserBottomSheet.show(getActivity().getSupportFragmentManager(),"Choose Premium Gradient");
    }






}
