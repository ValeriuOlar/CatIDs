package com.vstability.catids;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button knowlage = (Button)findViewById(R.id.yknowlage);
        Button knowlage2 = (Button)findViewById(R.id.yknowlagee);
        Button camera1 = (Button)findViewById(R.id.camera);
        Button chart1 = (Button)findViewById(R.id.chart);

        knowlage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(MainActivity.this, YouTubeknow.class);
                startActivity(int1);
            }
        });
        camera1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int2 = new Intent(MainActivity.this, camera.class);
                startActivity(int2);
            }
        });
        chart1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int3 = new Intent(MainActivity.this, infochart.class);
                startActivity(int3);
            }
        });
        knowlage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int4 = new Intent(MainActivity.this, breed.class);
                startActivity(int4);
            }
        });
    }
}
