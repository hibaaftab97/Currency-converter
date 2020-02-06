package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view)
    {
        EditText textfield=(EditText) findViewById(R.id.editText);
        String money=textfield.getText().toString();
        double dollaramnt=Double.parseDouble(money);
        double convertedAmount=100*dollaramnt;
        Toast.makeText(MainActivity.this,"Rs"+String.format("%.2f",convertedAmount),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
