package com.example.supporty;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/user/signup")
    Call<SignupRes> signupRequest(@Body SignupData data);

    @POST("/user/login")
    Call<SignupRes> loginRequest(@Body SignupData data);

}

