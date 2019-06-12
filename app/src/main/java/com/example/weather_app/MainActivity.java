package com.example.weather_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    String country, city;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selector);
        Button find=(Button) findViewById(R.id.button);
        country=((EditText) findViewById(R.id.editText)).getText().toString();
        city=((EditText) findViewById(R.id.editText2)).getText().toString();
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wea=new Intent(MainActivity.this,weather.class);
                startActivity(wea);
            }
        });
    }


}
