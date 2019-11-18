package com.example.tabok_ui_dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Login extends AppCompatActivity {

    LinearLayout layout1, layout2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        layout1 = (LinearLayout)findViewById(R.id.login_dosen);
        layout2 = (LinearLayout)findViewById(R.id.login_mhs);

//        layout1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent i = new Intent(Login.this,Login_Dosen.class);
//                startActivity(i);
//                finish();
//            }
//        });
        layout2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Login.this,login_mhs.class);
                startActivity(i);
                finish();
            }
        });
    }
}
