package com.example.supporty;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SignupActivity extends AppCompatActivity {

    private Button sendCertification, checkCertification, completeSignup;
    private EditText signupEmail, certificationNumber, signupPasswd, signupPasswdCheck;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_signup);

        signupEmail = findViewById(R.id.signupEmail);
        certificationNumber = findViewById(R.id.certification);
        sendCertification = findViewById(R.id.sendCertification);
        checkCertification = findViewById(R.id.checkCertification);
        signupPasswd = findViewById(R.id.signupPasswd);
        signupPasswdCheck = findViewById(R.id.signupPasswdCheck);
        completeSignup = findViewById(R.id.completeSignup);


        sendCertification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"인증번호 발송",Toast.LENGTH_LONG).show();
            }
        });


        checkCertification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"인증번호 확인",Toast.LENGTH_LONG).show();
            }
        });


        completeSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = signupEmail.getText().toString();
                String certfication = certificationNumber.getText().toString();
                String passwd = signupPasswd.getText().toString();
                String passwdCheck = signupPasswdCheck.getText().toString();

                if( email.isEmpty() || certfication.isEmpty() || passwd.isEmpty() || passwdCheck.isEmpty()) {
                    Toast.makeText(getApplicationContext(), "정보를 모두 입력하세요", Toast.LENGTH_LONG).show();
                } 
                else if (!passwd.equals(passwdCheck)) {
                    Toast.makeText(getApplicationContext(), "비밀번호가 일치하지 않습니다", Toast.LENGTH_LONG).show();
                } else {
                    Intent intent = new Intent(SignupActivity.this, HomeActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
