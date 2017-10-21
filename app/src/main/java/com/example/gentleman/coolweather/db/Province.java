package com.example.gentleman.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * 省份的数据库 LitePal中的实体类都要继承DataSupport
 * Created by gentleman on 2017/10/19.
 */

public class Province extends DataSupport{
    //id字段
    private int id;
    //省的名字
    private String provinceName;
    //省的代号
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
