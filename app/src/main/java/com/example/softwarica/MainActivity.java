package com.example.softwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText e1, e2, e3;
TextView t1;
Button b1, b2, b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.num1);
        e2=(EditText)findViewById(R.id.num2);
        e3=(EditText)findViewById(R.id.num3);

        b1=(Button)findViewById(R.id.btn1);
        b2=(Button)findViewById(R.id.btn2);
        b3=(Button)findViewById(R.id.btn3) ;

        t1=(TextView)findViewById(R.id.text1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer i1= Integer.parseInt(e1.getText().toString());
                Integer i2= Integer.parseInt(e2.getText().toString());
                Integer i3= Integer.parseInt(e3.getText().toString());
                Integer i4=i1+i2+i3;
                t1.setText(Integer.toString(i4));
            }
        });


        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer i1= Integer.parseInt(e1.getText().toString());
                Integer i2= Integer.parseInt(e2.getText().toString());
                Integer i3= Integer.parseInt(e3.getText().toString());
                Integer i4=i1-i2-i3;
                t1.setText(Integer.toString(i4));
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer i1= Integer.parseInt(e1.getText().toString());
                Integer i2= Integer.parseInt(e2.getText().toString());
                Integer i3= Integer.parseInt(e3.getText().toString());
                Integer i4=(i1*i2*i3)/100;
                t1.setText(Integer.toString(i4));
            }
        });

    }
}
