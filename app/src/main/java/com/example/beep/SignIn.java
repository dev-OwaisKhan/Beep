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
    String check_mail,mail;

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
               check_mail = "@jainuniversity.ac.in";
               mail = email.getText().toString();
               if (mail.isEmpty() || mail.toLowerCase().contains(check_mail) == false || mail.length() != 31)
               {
                   Toast.makeText(SignIn.this, "Invalid Email", Toast.LENGTH_SHORT).show();
               }
               else if (password.getText().toString().isEmpty() || password.getText().toString().length()!=8)
               {
                   Toast.makeText(SignIn.this, "Invalid Password", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Intent intent = new Intent(SignIn.this,Home.class);
                   startActivity(intent);
                   finish();
               }
           }
       });
    }
}