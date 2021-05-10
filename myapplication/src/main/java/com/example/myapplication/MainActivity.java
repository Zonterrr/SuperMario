package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyGraph(this));
    }
    public void gogo(View view ){
        Intent i = new Intent(MainActivity.this, MainActivity2.class);
        startActivity(i);
    }
}
