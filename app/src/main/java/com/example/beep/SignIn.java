package com.example.beep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

       enter.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if (email.getText().toString().isEmpty() && password.getText().toString().isEmpty())
               {
                   Toast.makeText(SignIn.this, "Email or password is not written", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Intent intent = new Intent(SignIn.this,Home.class);
                   startActivity(intent);
               }
           }
       });
    }
}