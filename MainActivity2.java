package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t2=findViewById(R.id.t2);
        SharedPreferences sh=getSharedPreferences("sp",MODE_PRIVATE);
        String s=sh.getString("t1","");
        t2.setText(s);

    }
}
