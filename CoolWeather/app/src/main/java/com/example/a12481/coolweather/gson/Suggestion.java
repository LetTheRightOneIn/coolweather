package com.example.a12481.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 12481 on 2018/5/27.
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public Carwash carwash;
    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class Carwash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
