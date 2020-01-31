package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void currcovert(View view){
    EditText editText =(EditText)findViewById(R.id.editText);
        String amountIndollars=editText.getText().toString();

        double d=Double.parseDouble(amountIndollars);

        double  x= d*71.13;

        String indian= String.format("%.2f",x);

        Toast.makeText(this,"$ "+amountIndollars+" is Rs."+indian,Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
