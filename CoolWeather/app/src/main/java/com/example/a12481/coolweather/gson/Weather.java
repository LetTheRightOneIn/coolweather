package com.example.a12481.coolweather.gson;



import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 12481 on 2018/5/27.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forcast>forcastList;
}
