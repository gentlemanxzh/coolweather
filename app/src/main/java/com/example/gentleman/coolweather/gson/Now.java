package com.example.gentleman.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 现在的温度和天气
 * Created by gentleman on 2017/10/21.
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
