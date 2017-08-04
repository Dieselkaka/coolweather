package com.gisstation.coolweather.android.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gisStation on 2017/8/3.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{

        @SerializedName("loc")
        public String updateTime;
    }
}
