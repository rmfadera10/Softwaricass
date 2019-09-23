package com.example.softwarica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity extends AppCompatActivity {
    private EditText username;
    private Button btnlogin;
    private Button btnlogout;
    private Button btnlogout1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);


        username = findViewById(R.id.username);
        btnlogin = findViewById(R.id.btnlogin);
        btnlogout = findViewById(R.id.btlogout);
        btnlogout1 = findViewById(R.id.btlogout1);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity.this, MainActivity.class);
                startActivity(intent);


            }
        });



       // Log.i("info","our message here");
        //Toast.makeText(this, "our message", Toast.LENGTH_SHORT).show();

        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity.this, Main2Activity.class);
                startActivity(intent);

            }
        });



        btnlogout1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Activity.this, abc.class);
                startActivity(intent);


            }
        });






    }
}
