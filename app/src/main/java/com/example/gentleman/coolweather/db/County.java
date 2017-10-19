package com.example.gentleman.coolweather.db;

/**
 * Created by gentleman on 2017/10/19.
 */

public class County {
    private int id;
    //县的名字
    private String countyName;
    //当前县多对应的天气Id
    private String weatherId;
    //记录当前县所属市的id值
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
