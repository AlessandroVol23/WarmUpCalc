package com.example.android.warmupcalc;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculate(View v) {

        EditText workingWeightView = (EditText) findViewById(R.id.edit_text_working_weight);
        int workingWeight = Integer.valueOf(workingWeightView.getText().toString());
        ArrayList<TextView> sets = new ArrayList<TextView>();
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner_percentage1);


        sets.add((TextView) findViewById(R.id.txt_1set));
        sets.add((TextView) findViewById(R.id.txt_2set));
        sets.add((TextView) findViewById(R.id.txt_3set));
        sets.add((TextView) findViewById(R.id.txt_4set));
        sets.add((TextView) findViewById(R.id.txt_5set));



        sets.get(0).setText("20kg");

        String a = spinner1.getSelectedItem().toString();
        //Log.v("Calc","Prozent: " + a);
        int spinnerPerce1=Integer.valueOf(spinner1.getSelectedItem().toString());
        Log.v("Calc","Prozent: " + spinnerPerce1);

        sets.get(1).setText(workingWeight / 100 * spinnerPerce1 + "kg");
        sets.get(2).setText(workingWeight / 100 * 60 + "kg");
        sets.get(3).setText(workingWeight / 100 * 80 + "kg");
        sets.get(4).setText(workingWeight / 100 * 90 + "kg");


    }

}
