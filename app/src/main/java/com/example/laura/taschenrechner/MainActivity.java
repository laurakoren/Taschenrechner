package com.example.laura.taschenrechner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }




    public void onDividiereClick(View view) {

        int number1, number2;


            EditText input1 = (EditText) findViewById(R.id.input1);
            EditText input2 = (EditText) findViewById(R.id.input2);
            EditText output1 = (EditText) findViewById(R.id.output1);



            number1 = Integer.parseInt(input1.getText().toString());
            number2 = Integer.parseInt(input2.getText().toString());

            output1.setText(String.valueOf(number1 / number2));


        }


    }



