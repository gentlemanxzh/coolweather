package com.example.gentleman.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gentleman on 2017/10/21.
 */

public class Suggestion {


    //舒适度
    @SerializedName("comf")
    public Comfort comfort;

    //舒适度
    @SerializedName("cw")
    public CarWash carWash;

    //运动建议
    public Sport sport;

    public class Comfort{
        @SerializedName("txt")
        public String info;
    }

    public class CarWash{
        @SerializedName("txt")
        public String info;

    }

    public class Sport{
        @SerializedName("txt")
        public String info;
    }


}
