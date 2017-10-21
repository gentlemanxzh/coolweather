package com.example.gentleman.coolweather.gson;

/**
 * 空气质量指数和pm25指数
 * Created by gentleman on 2017/10/21.
 */

public class AQI {
    public AQICity city;

    public class AQICity{
        //空气质量指数
        public String aqi;
        public String pm25;
    }

}
