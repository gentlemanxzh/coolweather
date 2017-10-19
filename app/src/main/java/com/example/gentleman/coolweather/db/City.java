package com.example.gentleman.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 市的数据库表
 * Created by gentleman on 2017/10/19.
 */

public class City extends DataSupport {
    private int id;
    //省的名字
    private String cityName;
    //省的代号
    private int cityCode;
    //记录当前市所属的省的id值
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
