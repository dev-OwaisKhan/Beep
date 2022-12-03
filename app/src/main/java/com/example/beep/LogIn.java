package com.example.beep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LogIn extends AppCompatActivity {

    EditText email, password ;
    Button login, signup, login_admin;
    String check_mail,mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        email = findViewById(R.id.emailID);
        password = findViewById(R.id.passwordText);
        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);
        login_admin = findViewById(R.id.login_as_admin);


       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               check_mail = "@jainuniversity.ac.in";
               mail = email.getText().toString();
               if (mail.isEmpty() || mail.toLowerCase().contains(check_mail) == false || mail.length() != 31)
               {
                   Toast.makeText(LogIn.this, "Invalid Email", Toast.LENGTH_SHORT).show();
               }
               else if (password.getText().toString().isEmpty() || password.getText().toString().length()!=8)
               {
                   Toast.makeText(LogIn.this, "Invalid Password", Toast.LENGTH_SHORT).show();
               }
               else
               {
                   Intent intent = new Intent(LogIn.this, HomeUser.class);
                   startActivity(intent);
                   finish();
               }
           }
       });

       signup.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(LogIn.this, SignUp_User.class);
               startActivity(intent);
               finish();
           }
       });

       login_admin.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent = new Intent(LogIn.this,LoginAdmin.class);
               startActivity(intent);
               finish();
           }
       });
    }
}