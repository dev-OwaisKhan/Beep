package com.example.beep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp_User extends AppCompatActivity {

    EditText user_email, user_password;
    Button signup_user;
    String email_text, password_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_user);

        user_password = findViewById(R.id.user_pass);
        user_email = findViewById(R.id.user_mail);
        signup_user = findViewById(R.id.signup_button);




       signup_user.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
            email_text = user_email.getText().toString();
            password_text = user_password.getText().toString();
            Intent intent = new Intent (SignUp_User.this, HomeUser.class);
            startActivity(intent);
            finish();
           }
       });



    }
}