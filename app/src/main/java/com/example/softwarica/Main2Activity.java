package com.example.softwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
private EditText c1;
private TextView t1;
private Button b11,b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        c1=(EditText)findViewById(R.id.temp1);
        t1=(TextView)findViewById(R.id.temp2);
        b11=(Button)findViewById(R.id.btn5);
        b12=(Button)findViewById(R.id.btn6) ;

        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp=Double.parseDouble(c1.getText().toString());
                double temperature=(temp-32)*5/9;
                t1.setText(Double.toString(temperature));
            }
        });


        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double temp=Double.parseDouble(c1.getText().toString());
                double temperature=(temp*9/5)+32;
                t1.setText(Double.toString(temperature));
            }
        });
    }
}
