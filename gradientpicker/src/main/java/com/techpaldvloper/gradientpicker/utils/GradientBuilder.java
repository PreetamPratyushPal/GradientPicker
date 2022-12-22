package com.techpaldvloper.gradientpicker.utils;


import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;

import java.util.ArrayList;
import java.util.List;

public class GradientBuilder {


    public  static final int WHITE= Color.WHITE;
    public static final int LIGHT_BLUE=Color.parseColor("#e9f5f8");
    public static final int LIGHT_GREEN=Color.parseColor("#e5fbe5");
    public static final int LIGHT_PURPLE=Color.parseColor("#e9e3f4");
    public static final int LIGHT_PINK=Color.parseColor("#ffdde2");
    public static final int BLACK=Color.BLACK;
    public static final int DARK_BLUE=Color.parseColor("#000029");
    public static final int DARK_GREEN=Color.parseColor("#041904");
    public static final int DARK_PURPLE=Color.parseColor("#19102b");
    public static final int DARK_PINK=Color.parseColor("#23050e");




    public static GradientDrawable getMetallicBlackGradient()
    {
        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#000000"),
                Color.parseColor("#383932"), Color.parseColor("#000000")});

        return gd;

    }


    public static int[] getMetallicBlackColors()
    {
        return new int[]{Color.parseColor("#000000"),
                Color.parseColor("#383932"), Color.parseColor("#000000")};

    }


    public static int getBlackStatusBarColor()
    {
        return Color.BLACK;
    }



    public static GradientDrawable getMetallicBlueGradient() {

        GradientDrawable gd = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{Color.parseColor("#141e30"),
                Color.parseColor("#185a9d"), Color.parseColor("#243b55")});

//        gd.setShape(GradientDrawable.RECTANGLE);


//        gd.setBounds(-10,-10,-10,-10);
        return gd;

    }

    public static int[] getMetallicBlueColors() {
        return new int[]{Color.parseColor("#141e30"),
                Color.parseColor("#185a9d"), Color.parseColor("#243b55")};
    }


    public static int[] getMetallicGreenColors()
    {
//        return new int[]{Color.parseColor("#006400"),
//                Color.parseColor("#58CD36"),Color.parseColor("#01452c")};


        return new int[]{Color.parseColor("#000C07"),
                Color.parseColor("#025839"),Color.parseColor("#011F14")};


    }


    public static int[] getMetallicPurpleColors()
    {
//        return new int[]{Color.parseColor("#301934"),
//                Color.parseColor("#AA00FF"),Color.parseColor("#301934")};

        return new int[]{Color.parseColor("#0A000A"),
                Color.parseColor("#6C006C"),Color.parseColor("#1E001E")};
    }


    public static int[] getMetallicPinkColors()
    {
//        return new int[]{Color.parseColor("#400026"),
//                Color.parseColor("#FE019A"),Color.parseColor("#3C1622")};

        return new int[]{Color.parseColor("#570C23"),
                Color.parseColor("#BE1B4C"),Color.parseColor("#791130")};
    }


    public static GradientDrawable getMetallicGreenGradient()
    {

//        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#006400"),
//                Color.parseColor("#58CD36"),Color.parseColor("#01452c")});


        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#000C07"),
                Color.parseColor("#025839"),Color.parseColor("#011F14")});


//        gd.setShape(GradientDrawable.RECTANGLE);

//        gd.setBounds(-10,-10,-10,-10);

        return gd;

    }



    public static GradientDrawable getMetallicPurpleGradient()
    {

//        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#301934"),
//                Color.parseColor("#AA00FF"),Color.parseColor("#301934")});


        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#0A000A"),
                Color.parseColor("#6C006C"),Color.parseColor("#1E001E")});



//        gd.setShape(GradientDrawable.RECTANGLE);

//        gd.setBounds(-10,-10,-10,-10);
        return gd;

    }



    public static GradientDrawable getMetallicPinkGradient()
    {

//        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#400026"),
//                Color.parseColor("#FE019A"),Color.parseColor("#3C1622")});

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#570C23"),
                Color.parseColor("#BE1B4C"),Color.parseColor("#791130")});

//        gd.setShape(GradientDrawable.RECTANGLE);
//        gd.setBounds(-10,-10,-10,-10);
        return gd;

    }


    public static int getBlueStatusBarColor()
    {
        return Color.parseColor("#141e30");
    }

    public static int getGreenStatusBarColor()
    {

//        return Color.parseColor("#006400");

        return Color.parseColor("#011F14");
    }



    public static int getPurpleStatusBarColor()
    {

//        return Color.parseColor("#301934");
        return Color.parseColor("#1E001E");
    }



    public static int getPinkStatusBarColor()
    {

//        return Color.parseColor("#400026");
        return Color.parseColor("#570C23");
    }



    public static LayerDrawable getLayerList(GradientDrawable gd)
    {
//        InsetDrawable insetLayer=new InsetDrawable(gd,-30,-30,-30,-30);
        GradientDrawable gd1=new GradientDrawable();
        gd1.setStroke(1,Color.WHITE);
        InsetDrawable insetLayer=new InsetDrawable(gd1,0,0,0,0);
        LayerDrawable ld=new LayerDrawable(new Drawable[]{insetLayer,gd});
//        ld.setLayerInset(0,-10,-10,-10,-10);


        return ld;
    }



    //bg colors
    public static int getLightBlueBgColor()
    {
//        return Color.parseColor("#e7feff");

        return LIGHT_BLUE;

    }

    public static int getDarkBlueBgColor()
    {

//        return Color.parseColor("#000036");
        return DARK_BLUE;

    }

    public static int getLightGreenBgColor()
    {
//        return Color.parseColor("#d0f0c0");
        return LIGHT_GREEN;

    }


    public static int getDarkGreenBgColor()
    {

//        return Color.parseColor("#00563f");
        return DARK_GREEN;

    }

    public static int getLightPurpleBgColor()
    {

//        return Color.parseColor("#b19cd9");
        return LIGHT_PURPLE;

    }

    public static int getDarkPurpleBgColor()
    {

//        return Color.parseColor("#301934");
        return DARK_PURPLE;

    }


    public static int getLightPinkBgColor()
    {

//        return Color.parseColor("#ffddf4");
        return LIGHT_PINK;

    }

    public static int getDarkPinkBgColor()
    {

//        return Color.parseColor("#69263A");

        return DARK_PINK;
    }



    public static int getWhiteBgColor()
    {
        return Color.WHITE;
    }

    public static int getBlackBgColor()
    {
        return Color.BLACK;
    }


    public static GradientDrawable getGeneralGradientDrawable(int insideColor)
    {
        GradientDrawable gd=new GradientDrawable();
        gd.setShape(GradientDrawable.OVAL);
        gd.setColor(insideColor);
        return gd;
    }

    public static GradientDrawable getSelectedGradientDrawable(int insideColor)
    {
        GradientDrawable gd1=new GradientDrawable();
        gd1.setShape(GradientDrawable.OVAL);
        gd1.setStroke(10,Color.RED);
        gd1.setColor(insideColor);
        return gd1;
    }



    public static int getLightColorPalette()
    {
        return Color.parseColor("#5C8C63");
    }

    public static int getDarkColorPalette()
    {

//        return Color.parseColor("#152A20");
//        return Color.parseColor("#743E33");
//        return Color.parseColor("#673c11");
//        return Color.parseColor("#262C2A");

        return Color.parseColor("#AD8B65");

    }

    public static int getNotificationColor()
    {

//        return Color.parseColor("#152A20");

        return Color.parseColor("#153258");

    }




    public static GradientDrawable getMetallicOrangeGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#fd5800"),
                Color.parseColor("#ff9f00"),Color.parseColor("#f94d00")});

        return gd;

    }



    public static int[] getMetallicOrangeColors()
    {
        return new int[]{Color.parseColor("#fd5800"),
                Color.parseColor("#ff9f00"),Color.parseColor("#f94d00")};
    }




    public static int getOrangeStatusBarColor()
    {
        return Color.parseColor("#f94d00");
    }




    public static GradientDrawable buildGradientFromColors(int startColor,int centerColor,int endColor,boolean isSelected)
    {

        GradientDrawable gd;

        if(centerColor!=Gradient.INF){
            gd = new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{startColor, centerColor, endColor});

        }
        else
        {
            gd = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{startColor, endColor});

        }

        if(isSelected)
        {
            gd.setStroke(10,Color.RED);
        }
        return gd;

    }






    public static List<Gradient> getPremiumColorGradients()
    {

        ArrayList<Gradient> gradientList=new ArrayList<>();

        gradientList.add(new Gradient("orange",getMetallicOrangeColors(),false));

        gradientList.add(new Gradient("red",getMetallicRedColors(),false));

        gradientList.add(new Gradient("brown",getMetallicBrownColors(),false));

        gradientList.add(new Gradient("golden",getMetallicGoldenColors(),false));

        gradientList.add(new Gradient("lime",getMetallicLimeColors(),false));

        gradientList.add(new Gradient("teal",getMetallicTealColors(),false));

        gradientList.add(new Gradient("cyan",getMetallicCyanColors(),false));


        gradientList.add(new Gradient("sea blue",getMetallicSeaBlueColors(),false));


        gradientList.add(new Gradient("bts purple",getBTSPurpleColors(),false));


        gradientList.add(new Gradient("heart pink",getHeartPinkColors(),false));


        gradientList.add(new Gradient("olive",getOliveColors(),false));


        gradientList.add(new Gradient("silver",getSilverColors(),false));

        gradientList.add(new Gradient("coral",getCoralColors(),false));

        gradientList.add(new Gradient("frost winter",getFrostWinterColors(),false));


        gradientList.add(new Gradient("mix 15",getMix15Colors(),false));

        gradientList.add(new Gradient("mix 16",getMix16Colors(),false));

        gradientList.add(new Gradient("mix 17",getMix17Colors(),false));


        gradientList.add(new Gradient("mix 18",getMix18Colors(),false));

//
//        gradientList.add(new Gradient("mix 19",getMix19Colors(),false));
//
//        gradientList.add(new Gradient("mix 20",getMix20Colors(),false));
//
//
//        gradientList.add(new Gradient("mix 21",getMix21Colors(),false));
//
//
//        gradientList.add(new Gradient("mix 22",getMix22Colors(),false));
//
//
//        gradientList.add(new Gradient("mix 23",getMix23Colors(),false));
//
//
//        gradientList.add(new Gradient("mix 24",getMix24Colors(),false));
//
//
//        gradientList.add(new Gradient("mix 25",getMix25Colors(),false));
//
//
//        gradientList.add(new Gradient("mix 26",getMix26Colors(),false));
//
//
//        gradientList.add(new Gradient("mix 27",getMix27Colors(),false));
//
//
//        gradientList.add(new Gradient("mix 28",getMix28Colors(),false));
//
//
//        gradientList.add(new Gradient("mix 29",getMix29Colors(),false));
//
//
//        gradientList.add(new Gradient("mix 30",getMix30Colors(),false));
//
//
//        gradientList.add(new Gradient("mix 31",getMix31Colors(),false));
//
//
//        gradientList.add(new Gradient("mix 32",getMix32Colors(),false));












        return gradientList;


    }











    public static GradientDrawable getMetallicRedGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#960018"),
                Color.parseColor("#c40233"),Color.parseColor("#860111")});

        return gd;

    }



    public static int[] getMetallicRedColors()
    {
        return new int[]{Color.parseColor("#960018"),
                Color.parseColor("#c40233"),Color.parseColor("#860111")};
    }








    public static GradientDrawable getMetallicBrownGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#321414"),
                Color.parseColor("#922724"),Color.parseColor("#3d0c02")});

        return gd;

    }



    public static int[] getMetallicBrownColors()
    {
        return new int[]{Color.parseColor("#321414"),
                Color.parseColor("#922724"),Color.parseColor("#3d0c02")};
    }






    public static GradientDrawable getMetallicGoldenGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#9b870c"),
                Color.parseColor("#fcc200"),Color.parseColor("#9b870c")});

        return gd;

    }





    public static int[] getMetallicGoldenColors()
    {
        return new int[]{Color.parseColor("#9b870c"),
                Color.parseColor("#fcc200"),Color.parseColor("#9b870c")};
    }






    public static GradientDrawable getMetallicLimeGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#648c11"),
                Color.parseColor("#9dc209"),Color.parseColor("#648c11")});


        return gd;


    }



    public static int[] getMetallicLimeColors()
    {
        return new int[]{
                Color.parseColor("#648c11"),
                Color.parseColor("#9dc209"),Color.parseColor("#648c11")
        };

    }




    public static GradientDrawable getMetallicTealGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#009b7d"),
                Color.parseColor("#41DF9B"),Color.parseColor("#009b7d")});


        return gd;


    }



    public static int[] getMetallicTealColors()
    {
        return new int[]{
                Color.parseColor("#009b7d"),
                Color.parseColor("#41DF9B"),Color.parseColor("#009b7d")
        };

    }







    public static GradientDrawable getMetallicCyanGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#008b8b"),
                Color.parseColor("#00cccc"),Color.parseColor("#008b8b")});


        return gd;


    }



    public static int[] getMetallicCyanColors()
    {
        return new int[]{
                Color.parseColor("#008b8b"),
                Color.parseColor("#00cccc"),Color.parseColor("#008b8b")
        };

    }





    public static GradientDrawable getMetallicSeaBlueGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#3f00ff"),
                Color.parseColor("#4166f5"),Color.parseColor("#3f00ff")});


        return gd;


    }



    public static int[] getMetallicSeaBlueColors()
    {
        return new int[]{
                Color.parseColor("#3f00ff"),
                Color.parseColor("#4166f5"),Color.parseColor("#3f00ff")
        };

    }






    public static GradientDrawable getBTSPurpleGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#9400d3"),
                Color.parseColor("#BC4CD8"),Color.parseColor("#9400d3")});


        return gd;


    }



    public static int[] getBTSPurpleColors()
    {
        return new int[]{
                Color.parseColor("#9400d3"),
                Color.parseColor("#BC4CD8"),Color.parseColor("#9400d3")
        };

    }






    public static GradientDrawable getHeartPinkGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#c71585"),
                Color.parseColor("#ff0090"),Color.parseColor("#c71585")});


        return gd;


    }



    public static int[] getHeartPinkColors()
    {
        return new int[]{
                Color.parseColor("#c71585"),
                Color.parseColor("#ff0090"),Color.parseColor("#c71585")
        };

    }





    public static GradientDrawable getOliveGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#867e36"),
                Color.parseColor("#b0bf1a"),Color.parseColor("#867e36")});


        return gd;


    }



    public static int[] getOliveColors()
    {
        return new int[]{
                Color.parseColor("#867e36"),
                Color.parseColor("#b0bf1a"),Color.parseColor("#867e36")
        };

    }





    public static GradientDrawable getSilverGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#838996"),
                Color.parseColor("#acacac"),Color.parseColor("#838996")});


        return gd;


    }



    public static int[] getSilverColors()
    {
        return new int[]{
                Color.parseColor("#838996"),
                Color.parseColor("#acacac"),Color.parseColor("#838996")
        };

    }




    public static GradientDrawable getCoralGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#ff6d37"),
                Color.parseColor("#ff926a"),Color.parseColor("#ff6d37")});


        return gd;


    }



    public static int[] getCoralColors()
    {
        return new int[]{
                Color.parseColor("#ff6d37"),
                Color.parseColor("#ff926a"),Color.parseColor("#ff6d37")
        };

    }



    public static GradientDrawable getFrostWinterGradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#4c7c9c"),
                Color.parseColor("#7ca0c2"),Color.parseColor("#4c7c9c")});


        return gd;


    }



    public static int[] getFrostWinterColors()
    {
        return new int[]{
                Color.parseColor("#4c7c9c"),
                Color.parseColor("#7ca0c2"),Color.parseColor("#4c7c9c")
        };

    }




    // todo start of addition of new gradients


    public static GradientDrawable getMix15Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#7F00FF"),
                Gradient.INF,Color.parseColor("#e100ff")});


        return gd;


    }



    public static int[] getMix15Colors()
    {
        return new int[]{
                Color.parseColor("#7F00FF"),
                Gradient.INF,Color.parseColor("#e100ff")
        };

    }



    public static GradientDrawable getMix16Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#FF5252"),
                Gradient.INF,Color.parseColor("#FF4081")});


        return gd;


    }



    public static int[] getMix16Colors()
    {
        return new int[]{
                Color.parseColor("#FF5252"),
                Gradient.INF,Color.parseColor("#FF4081")
        };

    }


    public static GradientDrawable getMix17Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#42275a"),
                Gradient.INF,Color.parseColor("#734b6d")});


        return gd;


    }



    public static int[] getMix17Colors()
    {
        return new int[]{
                Color.parseColor("#42275a"),
                Gradient.INF,Color.parseColor("#734b6d")
        };

    }




    public static GradientDrawable getMix18Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#808080"),
                Gradient.INF,Color.parseColor("#3fada8")});


        return gd;


    }



    public static int[] getMix18Colors()
    {
        return new int[]{
                Color.parseColor("#808080"),
                Gradient.INF,Color.parseColor("#3fada8")
        };

    }







    public static GradientDrawable getMix19Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                new int[]{Color.parseColor("#f12711"),
                        Gradient.INF,Color.parseColor("#f5af19")});


        return gd;


    }



    public static int[] getMix19Colors()
    {
        return new int[]{
                Color.parseColor("#f12711"),
                Gradient.INF,Color.parseColor("#f5af19")
        };

    }







    public static GradientDrawable getMix20Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#000428"),
                Gradient.INF,Color.parseColor("#004e92")});


        return gd;


    }



    public static int[] getMix20Colors()
    {
        return new int[]{
                Color.parseColor("#000428"),
                Gradient.INF,Color.parseColor("#004e92")
        };

    }








    public static GradientDrawable getMix21Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#141e30"),
                Gradient.INF,Color.parseColor("#243b55")});


        return gd;


    }



    public static int[] getMix21Colors()
    {
        return new int[]{
                Color.parseColor("#141e30"),
                Gradient.INF,Color.parseColor("#243b55")
        };

    }



    public static GradientDrawable getMix22Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                new int[]{Color.parseColor("#009245"),
                        Gradient.INF,Color.parseColor("#FCEE21")});


        return gd;


    }



    public static int[] getMix22Colors()
    {
        return new int[]{
                Color.parseColor("#009245"),
                Gradient.INF,Color.parseColor("#FCEE21")
        };

    }





    public static GradientDrawable getMix23Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#b24592"),
                Gradient.INF,Color.parseColor("#f15f79")});


        return gd;


    }



    public static int[] getMix23Colors()
    {
        return new int[]{
                Color.parseColor("#b24592"),
                Gradient.INF,Color.parseColor("#f15f79")
        };

    }




    public static GradientDrawable getMix24Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#136a8a"),
                Gradient.INF,Color.parseColor("#267871")});


        return gd;


    }



    public static int[] getMix24Colors()
    {
        return new int[]{
                Color.parseColor("#136a8a"),
                Gradient.INF,Color.parseColor("#267871")
        };

    }




    public static GradientDrawable getMix25Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#833ab4"),
                Gradient.INF,Color.parseColor("#fcb045")});


        return gd;


    }



    public static int[] getMix25Colors()
    {
        return new int[]{
                Color.parseColor("#833ab4"),
                Gradient.INF,Color.parseColor("#fcb045")
        };

    }



    public static GradientDrawable getMix26Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,new int[]{Color.parseColor("#485563"),
                Gradient.INF,Color.parseColor("#29323c")});


        return gd;


    }



    public static int[] getMix26Colors()
    {
        return new int[]{
                Color.parseColor("#485563"),
                Gradient.INF,Color.parseColor("#29323c")
        };

    }




    public static GradientDrawable getMix27Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                new int[]{Color.parseColor("#f09819"),
                        Gradient.INF,Color.parseColor("#edde5d")});


        return gd;


    }



    public static int[] getMix27Colors()
    {
        return new int[]{
                Color.parseColor("#f09819"),
                Gradient.INF,Color.parseColor("#edde5d")
        };

    }




    public static GradientDrawable getMix28Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                new int[]{Color.parseColor("#11998e"),
                        Gradient.INF,Color.parseColor("#38ef7d")});


        return gd;


    }



    public static int[] getMix28Colors()
    {
        return new int[]{
                Color.parseColor("#11998e"),
                Gradient.INF,Color.parseColor("#38ef7d")
        };

    }





    public static GradientDrawable getMix29Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                new int[]{Color.parseColor("#c79081"),
                        Gradient.INF,Color.parseColor("#dfa579")});


        return gd;


    }



    public static int[] getMix29Colors()
    {
        return new int[]{
                Color.parseColor("#c79081"),
                Gradient.INF,Color.parseColor("#dfa579")
        };

    }




    public static GradientDrawable getMix30Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                new int[]{Color.parseColor("#ff0844"),
                        Gradient.INF,Color.parseColor("#ffb199")});


        return gd;


    }



    public static int[] getMix30Colors()
    {
        return new int[]{
                Color.parseColor("#ff0844"),
                Gradient.INF,Color.parseColor("#ffb199")
        };

    }




    public static GradientDrawable getMix31Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                new int[]{Color.parseColor("#F57F17"),
                        Gradient.INF,Color.parseColor("#880E4F")});


        return gd;


    }



    public static int[] getMix31Colors()
    {
        return new int[]{
                Color.parseColor("#F57F17"),
                Gradient.INF,Color.parseColor("#880E4F")
        };

    }





    public static GradientDrawable getMix32Gradient()
    {

        GradientDrawable gd=new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT,
                new int[]{Color.parseColor("#f84b00"),
                        Gradient.INF,Color.parseColor("#e20b8c")});


        return gd;


    }



    public static int[] getMix32Colors()
    {
        return new int[]{
                Color.parseColor("#f84b00"),
                Gradient.INF,Color.parseColor("#e20b8c")
        };

    }










    //todo end of addition of new gradients








    public static GradientDrawable buildBackgroundFromColor(int insideColor,boolean isSelected)
    {
        GradientDrawable gd=new GradientDrawable();
        gd.setColor(insideColor);

        if(isSelected)
        {
            gd.setStroke(9,Color.RED);
        }

        return gd;
    }






//    public static List<Background> getPremiumLightBackgroundColors()
//    {
//
//        ArrayList<Background> lightBackgroundList=new ArrayList<>();
//        lightBackgroundList.add(new Background("light orange",Color.parseColor("#ffeac4"),false,true));
//        lightBackgroundList.add(new Background("light red",Color.parseColor("#ffd8d8"),false,true));
//
//        lightBackgroundList.add(new Background("light brown",Color.parseColor("#f6ddc7"),false,true));
//
//        lightBackgroundList.add(new Background("light golden",Color.parseColor("#fff6c4"),false,true));
//
//        lightBackgroundList.add(new Background("light lime",Color.parseColor("#f0ffc4"),false,true));
//
//        lightBackgroundList.add(new Background("light teal",Color.parseColor("#e2ffff"),false,true));
//
//        lightBackgroundList.add(new Background("light cyan",Color.parseColor("#e0ffff"),false,true));
//
//        lightBackgroundList.add(new Background("light sea blue",Color.parseColor("#e2f7ff"),false,true));
//
//
//        lightBackgroundList.add(new Background("light bts purple",Color.parseColor("#fff6ff"),false,true));
//
//        lightBackgroundList.add(new Background("light heart pink",Color.parseColor("#ffe7eb"),false,true));
//
//        lightBackgroundList.add(new Background("light olive",Color.parseColor("#ffffe2"),false,true));
//
//
//        lightBackgroundList.add(new Background("light silver",Color.parseColor("#fbfbfb"),false,true));
//
//        lightBackgroundList.add(new Background("light coral",Color.parseColor("#ffe3d9"),false,true));
//
//        lightBackgroundList.add(new Background("light frost winter",Color.parseColor("#f2f8fd"),false,true));
//
//        return lightBackgroundList;
//
//
//    }
//
//
//
//    public static List<Background> getPremiumDarkBackgroundColors()
//    {
//
//        ArrayList<Background> darkBackgroundList=new ArrayList<>();
//        darkBackgroundList.add(new Background("dark orange",Color.parseColor("#623600"),false,false));
//        darkBackgroundList.add(new Background("dark red",Color.parseColor("#3d0000"),false,false));
//
//        darkBackgroundList.add(new Background("dark brown",Color.parseColor("#2a1c0e"),false,false));
//
//        darkBackgroundList.add(new Background("dark golden",Color.parseColor("#4e4200"),false,false));
//
//        darkBackgroundList.add(new Background("dark lime",Color.parseColor("#2c3b00"),false,false));
//
//        darkBackgroundList.add(new Background("dark teal",Color.parseColor("#003232"),false,false));
//
//        darkBackgroundList.add(new Background("dark cyan",Color.parseColor("#001515"),false,false));
//
//        darkBackgroundList.add(new Background("dark sea blue",Color.parseColor("#00161e"),false,false));
//
//
//        darkBackgroundList.add(new Background("dark bts purple",Color.parseColor("#1e001e"),false,false));
//
//        darkBackgroundList.add(new Background("dark heart pink",Color.parseColor("#23050e"),false,false));
//
//        darkBackgroundList.add(new Background("dark olive",Color.parseColor("#1e1e00"),false,false));
//
//
//        darkBackgroundList.add(new Background("dark silver",Color.parseColor("#191919"),false,false));
//
//        darkBackgroundList.add(new Background("dark coral",Color.parseColor("#641b00"),false,false));
//
//        darkBackgroundList.add(new Background("dark frost winter",Color.parseColor("#153258"),false,false));
//
//        return darkBackgroundList;
//
//
//    }











}
