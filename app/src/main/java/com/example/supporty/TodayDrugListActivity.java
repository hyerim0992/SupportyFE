package com.example.supporty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TodayDrugListActivity extends AppCompatActivity {
    private Button arrow_right, drugname;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_todaydrugslist);

        arrow_right = findViewById(R.id.button2);
        drugname = findViewById(R.id.button);

        arrow_right.setOnClickListener(new View.OnClickListener() { //다음 날짜로 이동하기
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"다음 날짜로 이동",Toast.LENGTH_LONG).show();
            }
        });

        drugname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    Intent intent = new Intent(TodayDrugListActivity.this, HomeActivity.class);
                    startActivity(intent);
            }
        });
    }
}
