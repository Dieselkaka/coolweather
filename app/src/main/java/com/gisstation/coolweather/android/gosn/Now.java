package com.gisstation.coolweather.android.gosn;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gisStation on 2017/8/3.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;
    }
}
