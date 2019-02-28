package com.example.a28feb19;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView textView=findViewById(R.id.textView3);
        TextView textView1=findViewById(R.id.textView4);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String s1 = extras.getString("name");
            String s2=extras.getString("body");
            textView.setText(s1);
            textView1.setText(s2);


        }

    }
}
