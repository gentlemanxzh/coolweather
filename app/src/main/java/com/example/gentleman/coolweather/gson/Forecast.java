package com.example.gentleman.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 由于daily_forecast里面是包含一个数组，所以我们这里定义单日的实体类，
 * 在声明实例引用的时候使用集合类型进行声明
 * Created by gentleman on 2017/10/21.
 */

public class Forecast {
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
