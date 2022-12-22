package com.techpaldvloper.gradientpicker;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.techpaldvloper.gradientpicker.utils.GradientChooserBottomSheet;

public class FragmentAdapter extends FragmentStatePagerAdapter {



    private final Context context;

    public FragmentAdapter(@NonNull FragmentManager fm,Context context)
    {
        super(fm,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.context=context;


    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        Fragment fragment=null;
        switch (position)
        {
            case 0:
                fragment=new GradientBottomSheet();
           break;
        }

        assert fragment!=null;
        return fragment;
    }

    @Override
    public int getCount() {
        return 1;
    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title=null;

        switch (position)
        {
            case 0:
                title=context.getResources().getString(R.string.bottom_sheet);
                break;
        }

        assert title!=null;
        return title;


    }
}
