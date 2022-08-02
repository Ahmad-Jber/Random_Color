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
}