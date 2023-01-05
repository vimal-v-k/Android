package com.example.form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=findViewById(R.id.t1);
        b1=findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences sharedPreferences=getSharedPreferences("sp",MODE_PRIVATE);
                SharedPreferences.Editor sp=sharedPreferences.edit();
                sp.putString("t1",t1.getText().toString());
                sp.apply();
                Intent i=new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i);


            }
        });
    }
}