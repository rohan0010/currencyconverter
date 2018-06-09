package com.example.rohan.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void clickFunction(View view)
    {
        EditText myTextField=(EditText)findViewById(R.id.myTextField);
        Double dollarAmountDouble =Double.parseDouble(myTextField.getText().toString());
        Double poundAmount = dollarAmountDouble*0.75;
        Toast.makeText(MainActivity.this,"£"+String.format("%.2f",poundAmount),Toast.LENGTH_SHORT).show();
        Log.i("Amount",myTextField.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
