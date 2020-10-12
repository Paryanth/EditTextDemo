package com.example.edittextdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText name ;
    Button echo ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        echo = findViewById(R.id.echo) ;
        echo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameToPrint = name.getText().toString() ;
                Toast.makeText(MainActivity.this, "Welcome, "+nameToPrint, Toast.LENGTH_LONG).show();
            }
        });
    }
}