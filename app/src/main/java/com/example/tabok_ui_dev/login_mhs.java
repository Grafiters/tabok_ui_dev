package com.example.tabok_ui_dev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class login_mhs extends AppCompatActivity {

    private EditText nim, pass;
    private TextView info;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_mhs);

        login = (Button)findViewById(R.id.login);
        nim = (EditText)findViewById(R.id.nim);
        pass = (EditText)findViewById(R.id.paswd);
        info = (TextView)findViewById(R.id.info);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validasi(nim.getText().toString(), pass.getText().toString());
            }
        });
    }
    public void validasi(String nim, String passwd){
        if ((nim.equals("nim")) && (passwd.equals("123"))){
            Intent i = new Intent(login_mhs.this,Dashboard_mhs.class);
            startActivity(i);
            finish();
        }else{
            info.setText("NIM atau PASSWORD salah / tidak cocok");
        }
    }
}
