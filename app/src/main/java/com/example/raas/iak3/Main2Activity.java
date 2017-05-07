package com.example.raas.iak3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

        Button tombol;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tombol = (Button) findViewById(R.id.button1);
        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(i);//klo yang ini sekampung yang pindah
                //setContentView(R.layout.activity_main); langsung pake ini bisa  tapi klo ini cuman di tiban bukannnya
                // di ganti atau kalo yang ini cuman seorang yang [indah
            }
        });
    }
}
