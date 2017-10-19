package com.example.gentleman.coolweather.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * OkHttp网络去请求工具类的请求
 * Created by gentleman on 2017/10/19.
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, Callback callback){
        //创建一个OkHttpClient对象
        OkHttpClient client = new OkHttpClient();
        //建立一个请求
        Request request = new Request.Builder()
                .url(address)
                .build();
        //enqueue开启子线程进行网络请求
        client.newCall(request).enqueue(callback);
    }

}
