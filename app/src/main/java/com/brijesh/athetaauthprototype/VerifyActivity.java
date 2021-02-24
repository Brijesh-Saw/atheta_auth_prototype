package com.brijesh.athetaauthprototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class VerifyActivity extends AppCompatActivity {
    Button Verify_OTP;
    EditText Otp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify);
        Otp = findViewById(R.id.otp_code);
        Verify_OTP = findViewById(R.id.verify);
        Verify_OTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = Otp.getText().toString();
                if(num.isEmpty()){
                    Otp.setError("Enter Number");
                }else{
                    Intent i = new Intent(VerifyActivity.this,HomeActivity.class);
                    startActivity(i);
                }
            }
        });
    }
}