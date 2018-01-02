package com.example.clicksample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = findViewById(R.id.text);
        findViewById(R.id.button).setOnClickListener(new OnDelayClickListener() {
            @Override
            void onDelayClick(View v) {
                text.append("\nクリック！");
            }
        });
    }
}
