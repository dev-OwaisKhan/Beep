package com.example.beep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginAdmin extends AppCompatActivity {

    Button login_admin;
    EditText email, password;
    String email_text, pass_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_admin);

        login_admin = findViewById(R.id.admin_login_button);
        email = findViewById(R.id.admin_email);
        password = findViewById(R.id.admin_password);

        login_admin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                email_text = email.getText().toString();
                pass_text = password.getText().toString();
                Intent intent = new Intent (LoginAdmin.this, HomeAdmin.class);
                startActivity(intent);
                finish();
            }
        });
    }
}