package com.example.supporty;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    @POST("/user/signup") //회원가입 라우트. 해당 경로로 서버에 POST 요청 보냄
    // 파라미터로 data 보내고 요청은 SignupRes 클래스의 콜백함수로...
    Call<SignupRes> signupRequest(@Body SignupData data);

    @POST("/user/login") //로그인 라우트
    //로그인은 LoginRes 클래스의 콜백함수로 받음
    Call<LoginRes> loginRequest(@Body SignupData data);

//    @DELETE("/user/delete")
//    Call<Void> deleteRequest(@Query("id") String id);

    @DELETE("/user/delete")
    Call<Void> deleteRequest(@Query("id") String id);

}

