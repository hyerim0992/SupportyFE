package com.example.supporty;

import com.google.gson.annotations.SerializedName;

public class SignupRes { //회원가입 시 서버로부터 받을 데이터
    @SerializedName("status")
    private int status;

    @SerializedName("message")
    private String message;


    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

}
