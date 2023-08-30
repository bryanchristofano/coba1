package com.example.coba1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;
    TextView tv1;
    String savedNumber = ""; // Menyimpan angka yang sudah diklik sebelumnya

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button3);
        tv1 = findViewById(R.id.textView2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "1";
                tv1.setText(savedNumber);
            }
        });

        b2 = findViewById(R.id.button);

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "2";
                tv1.setText(savedNumber);
            }
        });

        b3 = findViewById(R.id.button2);

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "3";
                tv1.setText(savedNumber);
            }
        });

        b4 = findViewById(R.id.button4);

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "4";
                tv1.setText(savedNumber);
            }
        });

        b5 = findViewById(R.id.button5);

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "5";
                tv1.setText(savedNumber);
            }
        });


        b6 = findViewById(R.id.button6);

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "6";
                tv1.setText(savedNumber);
            }
        });

        b7 = findViewById(R.id.button8);

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "7";
                tv1.setText(savedNumber);
            }
        });

        b8 = findViewById(R.id.button7);

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "8";
                tv1.setText(savedNumber);
            }
        });

        b9 = findViewById(R.id.button9);

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "9";
                tv1.setText(savedNumber);
            }
        });


        b0 = findViewById(R.id.button11);

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                savedNumber += "0";
                tv1.setText(savedNumber);
            }
        });
    }
}
