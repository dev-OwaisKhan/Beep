package com.example.beep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {

    private EditText email, password ;
    private Button enter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        email = findViewById(R.id.emailID);
        password = findViewById(R.id.passwordText);
        enter = findViewById(R.id.enterButton);

        if (email.getText().toString() != null && password.getText().toString() != null)
        {
            startActivity(new Intent(SignIn.this,Home.class));
            finish();
        }
    }
}