package com.gym.randomcolor;

import java.util.ArrayList;

public class Colors {
    private String ColorCode;
    private String ColorName;
    public Colors(String colorCode, String colorName) {
        ColorCode = colorCode;
        ColorName = colorName;
    }

    public String getColorCode() {
        return ColorCode;
    }

    public String getColorName() {
        return ColorName;
    }
    int getColorId(String colorName){
        switch (colorName){
            case "AliceBlue": return R.color.AliceBlue;
            case "AntiqueWhite": return R.color.AntiqueWhite;
            case "Aqua": return R.color.Aqua;
            case "Aquamarine": return R.color.Aquamarine;
            case "Azure": return R.color.Azure;
        }
        return 0;
    }
}