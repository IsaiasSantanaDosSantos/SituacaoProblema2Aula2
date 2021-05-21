package com.example.olamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn_um);
        btn2 = findViewById(R.id.btn_dois);

        btn1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View view){
                Toast.makeText(MainActivity.this, "Primeiro botão" , Toast.LENGTH_SHORT).show();
            }
        });
    }
}
