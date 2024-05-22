package com.example.supporty;

import com.google.gson.annotations.SerializedName;

public class SignupData { //회원가입시 서버에 보낼 데이터
    @SerializedName("id")
    private String id;

    @SerializedName("passwd")
    private String passwd;

    public SignupData(String id, String passwd) {
        this.id = id;
        this.passwd = passwd;
    }
}

//class DeleteData { //회원탈퇴 시 서버에 보낼 데이터
//    @SerializedName("id")
//    private String id;
//
//    public DeleteData(String id) {
//        this.id = id;
//    }
//}
