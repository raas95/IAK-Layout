package com.example.raas.iak3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tmblser,isi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tmblser = (TextView) findViewById(R.id.textView2);
        isi = (TextView) findViewById(R.id.textView2);
        tmblser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(Intent.ACTION_SEND);
                i.putExtra(Intent.EXTRA_TEXT,isi.getText().toString());
            i.setType("text/plain");
                startActivity(i);
            }
        });
    }
}
