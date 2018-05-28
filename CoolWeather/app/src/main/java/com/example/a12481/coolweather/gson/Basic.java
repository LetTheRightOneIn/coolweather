package com.example.a12481.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 12481 on 2018/5/27.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updataTime;
    }
}
