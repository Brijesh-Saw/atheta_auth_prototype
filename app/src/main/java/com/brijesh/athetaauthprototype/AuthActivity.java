package com.brijesh.athetaauthprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AuthActivity extends AppCompatActivity {
    Button Get_OTP;
    EditText Number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        Number = findViewById(R.id.number);
     Get_OTP = findViewById(R.id.otp);

     Get_OTP.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             String number = Number.getText().toString();
             if(number.isEmpty()){
                 Number.setError("Enter Number");
             }else
             {
                 Intent i = new Intent(AuthActivity.this,VerifyActivity.class);
                 startActivity(i);
             }
         }
     });
    }
}