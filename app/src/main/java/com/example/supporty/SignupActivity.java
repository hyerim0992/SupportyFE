package com.example.supporty;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;



public class SignupActivity extends AppCompatActivity {

    private Button checkIdDupl, completeSignup;
    private EditText signupId, signupPasswd, signupPasswdCheck;
    private ApiService apiServiceInterface;
    private Retrofit retrofit;

    private void startSignup(SignupData data) {
        apiServiceInterface.signupRequest(data).enqueue(new Callback<SignupRes>() {
            @Override
            public void onResponse(@NonNull Call<SignupRes> call, @NonNull Response<SignupRes> response) {
                SignupRes result = response.body();
                assert result != null;
                if(result.getStatus()==200) {
                    finish();
                }
            }

            @Override
            public void onFailure(Call<SignupRes> call, Throwable t) {
                // 통신 실패 시 처리
                Log.e("회원가입 오류", t.getMessage());
                t.printStackTrace();
            }
        });

    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);

        signupId = findViewById(R.id.signupId);
        checkIdDupl = findViewById(R.id.checkIdDupl);
        signupPasswd = findViewById(R.id.signupPasswd);
        signupPasswdCheck = findViewById(R.id.signupPasswdCheck);
        completeSignup = findViewById(R.id.completeSignup);

        retrofit = RetrofitClient.getClient();
        apiServiceInterface = retrofit.create(ApiService.class);

        checkIdDupl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        completeSignup.setOnClickListener(v -> {
            String id = signupId.getText().toString();
            String passwd = signupPasswd.getText().toString();
            String passwdCheck = signupPasswdCheck.getText().toString();

            if( id.isEmpty() || passwd.isEmpty() || passwdCheck.isEmpty()) {
                Toast.makeText(getApplicationContext(), "정보를 모두 입력하세요", Toast.LENGTH_LONG).show();
            }
            else if (!passwd.equals(passwdCheck)) {
                Toast.makeText(getApplicationContext(), "비밀번호가 일치하지 않습니다", Toast.LENGTH_LONG).show();
            } else {
                startSignup(new SignupData(id, passwd));
                finish();
//              Intent intent = new Intent(SignupActivity.this, HomeActivity.class);
//              startActivity(intent);
            }

        });


    }
}
