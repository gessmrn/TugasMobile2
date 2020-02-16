package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnsin;
    private Button btncos;
    private Button btntan;
    private Button btncsc;
    private Button btncot;
    private Button btnsec;
    private Button btnlog;
    private EditText angka;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angka = findViewById(R.id.et_angka);
        tvHasil = findViewById(R.id.tv_hasil);

        btnsin = findViewById(R.id.sin);
        btnsin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSin = angka.getText().toString();
                    double dSin = Double.parseDouble(sSin);
                    double sin = Math.sin(dSin);
                    String sHasil = String.valueOf(sin);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btncos = findViewById(R.id.cos);
        btncos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCos = angka.getText().toString();
                    double dCos = Double.parseDouble(sCos);
                    double cos = Math.cos(dCos);
                    String sHasil = String.valueOf(cos);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btntan = findViewById(R.id.tan);
        btntan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sTan = angka.getText().toString();
                    double dTan = Double.parseDouble(sTan);
                    double tan = Math.tan(dTan);
                    String sHasil = String.valueOf(tan);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btncsc = findViewById(R.id.csc);
        btncsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCsc = angka.getText().toString();
                    double dCsc = Double.parseDouble(sCsc);
                    double csc = 1.0/Math.sin(dCsc);
                    String sHasil = String.valueOf(csc);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnsec = findViewById(R.id.sec);
        btnsec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sSec = angka.getText().toString();
                    double dSec = Double.parseDouble(sSec);
                    double sec = 1.0/Math.cos(dSec);
                    String sHasil = String.valueOf(sec);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btncot = findViewById(R.id.cot);
        btncot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sCot = angka.getText().toString();
                    double dCot = Double.parseDouble(sCot);
                    double cot = 1.0/Math.tan(dCot);
                    String sHasil = String.valueOf(cot);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnlog = findViewById(R.id.log);
        btnlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sLog = angka.getText().toString();
                    double dLog = Double.parseDouble(sLog);
                    double log = Math.log10(dLog);
                    String sHasil = String.valueOf(log);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
