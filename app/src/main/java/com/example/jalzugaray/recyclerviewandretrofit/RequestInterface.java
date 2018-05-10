package com.example.jalzugaray.recyclerviewandretrofit;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by jalzugaray on 08/05/2018.
 */

public interface RequestInterface {
    @GET("android/jsonandroid")
    Call<JSONResponse> getJSON();
}
