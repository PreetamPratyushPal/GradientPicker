package com.techpaldvloper.gradientpicker.utils;

import android.graphics.Color;

public class Gradient {




    public Gradient()
    {

    }

    public Gradient(String name, int [] colors, boolean isSelected)
    {
        this.name=name;
        if(colors!=null)
        {
            if(colors.length==3)
            {
                this.startColor=colors[0];
                this.centerColor=colors[1];
                this.endColor=colors[2];


            }
        }

        this.isSelected=isSelected;

    }

    private String name;

    public static final int INF= Color.TRANSPARENT;
    private int startColor,centerColor=INF,endColor;

    private boolean isSelected;


    public void setSelected(boolean selected)
    {
        this.isSelected=selected;
    }


    public boolean isSelected()
    {
        return isSelected;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStartColor() {
        return startColor;
    }

    public void setStartColor(int startColor) {
        this.startColor = startColor;
    }

    public int getCenterColor() {
        return centerColor;
    }

    public void setCenterColor(int centerColor) {
        this.centerColor = centerColor;
    }

    public int getEndColor() {
        return endColor;
    }

    public void setEndColor(int endColor) {
        this.endColor = endColor;
    }












}