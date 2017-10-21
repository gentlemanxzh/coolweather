package com.example.gentleman.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 城市名称、天气id、更新时间
 * 由于Json中的一些字段不能好直接用来Java命名
 * 因此这里使用@SerializedName注解来让Json字段和java字段建立映射关系
 * Created by gentleman on 2017/10/21.
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
