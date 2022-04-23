package com.example.practical_06;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @SuppressLint("SetTextI18n")
    public void Add(View v) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 + n2;

        et3.setText("Addition Value" + result);

    }

    public View findViewById(int editTextNumber) {
        return null;
    }

    @SuppressLint("SetTextI18n")
    public void Sub(View v) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 - n2;

        et3.setText("Subtract Value" + result);
    }

    @SuppressLint("SetTextI18n")
    public void Mul(View v) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 * n2;

        et3.setText("Multiply Value" + result);
    }

    @SuppressLint("SetTextI18n")
    public void Div(View v) {
        EditText et1 = (EditText) findViewById(R.id.editTextNumber);
        EditText et2 = (EditText) findViewById(R.id.editTextNumber2);
        EditText et3 = (EditText) findViewById(R.id.editTextNumber3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 / n2;

        et3.setText("Divide Value" + result);
    }
}