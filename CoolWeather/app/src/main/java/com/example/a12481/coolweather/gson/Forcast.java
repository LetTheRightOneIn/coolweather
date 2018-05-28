package com.example.a12481.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 12481 on 2018/5/27.
 */

public class Forcast {
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        public String max;
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
