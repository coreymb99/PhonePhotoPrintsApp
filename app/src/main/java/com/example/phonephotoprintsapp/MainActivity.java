package com.example.phonephotoprintsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    double radioPrnts = .19;
    double radioPrints2 = .49;
    double radioPrints3 = .79;
    double totalPrice;
    int txtPrntNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Program in the App Icon for Launch

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        //final variables declarations, associating user input final EditText

        final EditText userInput = (EditText) findViewById(R.id.txtPrntNumber);
        final RadioButton prntButton19 = (RadioButton) findViewById(R.id.radioPrnts);
        final RadioButton prntButton49 = (RadioButton) findViewById(R.id.radioPrnts2);
        final RadioButton prntButton79 = (RadioButton) findViewById(R.id.radioPrnts3);
        final TextView result = (TextView) findViewById(R.id.txtResults);

        //time for the GUI

        Button button = (Button) findViewById(R.id.btnOrder);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Code the algorithms that will take place for the variables
                //messed this up for so long, then realized all of the code wasnt inside of the onClick
                //toString method aswell.

                txtPrntNumber = Integer.parseInt(userInput.getText().toString());
                DecimalFormat cost = new DecimalFormat("$###,###.##");

                if(prntButton19.isChecked()) {
                    totalPrice = txtPrntNumber * radioPrnts;
                    result.setText("The Order Cost is " + cost.format(totalPrice) );
                }

                if(prntButton49.isChecked()) {
                    totalPrice = txtPrntNumber * radioPrints2;
                    result.setText("The Order Cost is " + cost.format(totalPrice) );
                }
                if(prntButton79.isChecked()) {
                    totalPrice = txtPrntNumber * radioPrints3;
                    result.setText("The Order Cost is " + cost.format(totalPrice) );

                }

            }
        });


    } //end of OnCreate
} // end of Main
//Corey Bartlett SPC ID: 2374833
//Notes for next 4-5, provide a more proper naming scheme for variables. This confused me on multiple occasions during this assignment.