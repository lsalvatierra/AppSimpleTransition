package com.example.luisangel.apptransition;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button bt_zoom, bt_left,bt_default,bt_fade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_zoom = (Button) findViewById(R.id.bt_zoom);
        bt_left  = (Button) findViewById(R.id.bt_left);
        bt_default = (Button) findViewById(R.id.bt_default);
        bt_fade = (Button) findViewById(R.id.bt_fade);


        bt_zoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                overridePendingTransition(R.anim.zoom_back_in,R.anim.zoom_back_in);
            }
        });

        bt_left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                overridePendingTransition(R.anim.left_in,R.anim.left_out);

            }
        });

        bt_default.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));

            }
        });


        bt_fade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);

            }
        });

    }
}
