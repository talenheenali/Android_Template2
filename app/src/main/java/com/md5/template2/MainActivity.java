package com.md5.template2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Timer timer = new Timer();
    private long delayTime = 3500;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timer.schedule(new TimerTask()
        {
            public void run()
            {

                    Intent intent;
                    intent = new Intent(getApplicationContext(), Activty_login.class);
                    finish();
                    startActivity(intent);

            }
        }, delayTime);
    }
}
