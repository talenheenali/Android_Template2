package com.md5.template2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import java.util.Timer;
import java.util.TimerTask;

public class Activty_login extends AppCompatActivity {

    TextView txt_forgotpass,txt_regi;
    Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txt_forgotpass=(TextView)findViewById(R.id.txt_forgotpass);
        txt_regi=(TextView)findViewById(R.id.txt_regi);
        btn_login=(Button) findViewById(R.id.btn_login);

        txt_forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(getApplicationContext(),Activity_passcreate.class);
                startActivity(i);
            }
        });

        txt_regi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(getApplicationContext(),Activity_regi.class);
                startActivity(i);
            }
        });

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                Intent i=new Intent(getApplicationContext(),Activity_profile.class);
                startActivity(i);
            }
        });


    }
}
