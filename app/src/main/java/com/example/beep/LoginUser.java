package com.example.beep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginUser extends AppCompatActivity {

    EditText user_email, user_password;
    Button login_user, login_admin;
    String email_text, password_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_user);

        user_password = findViewById(R.id.user_pass);
        user_email = findViewById(R.id.user_mail);
        login_user = findViewById(R.id.login_user);
        login_admin = findViewById(R.id.login_admin);



       login_user.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            email_text = user_email.getText().toString();
            password_text = user_password.getText().toString();
            Intent intent = new Intent (LoginUser.this, HomeUser.class);
            startActivity(intent);
            finish();
           }
       });

        login_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent  = new Intent(LoginUser.this, LoginAdmin.class);
                startActivity(intent);
                finish();

            }
        });

    }
}