package com.example.a12481.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 12481 on 2018/5/27.
 */

public class Now {
    @SerializedName("tmp")
    public  String temperture;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
