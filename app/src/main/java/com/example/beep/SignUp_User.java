package com.example.beep;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class SignUp_User extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    EditText user_email, user_password, user_name, conf_password ;
    Button signup_user;
    String email_text, password_text, name_text, conf_text, brnch;
    Spinner branch;
    String []brch ={"MACT","AI","CTIS","DS","SE","CSE"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup_user);

        user_password = findViewById(R.id.user_pass);
        user_email = findViewById(R.id.user_mail);
        user_name = findViewById(R.id.username);
        conf_password = findViewById(R.id.user_conf_pass);
        signup_user = findViewById(R.id.signup_button);
        branch = findViewById(R.id.branch);


        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item,brch);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branch.setAdapter(adapter);
        branch.setOnItemSelectedListener(this);

        signup_user.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

            email_text = user_email.getText().toString().toLowerCase();
            password_text = user_password.getText().toString();
            conf_text = conf_password.getText().toString();
            name_text = user_name.getText().toString();

            if (email_text.endsWith("@jainuniversity.ac.in") && password_text.equals(conf_text))
            {
            Intent intent = new Intent (SignUp_User.this, HomeUser.class);
            startActivity(intent);
            finish();
           }
            else
            {
                Log.d("kk","wrong pass");
            }
           }
       });

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
       brnch = brch[i];
        Toast.makeText(this,brnch,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {
       brnch = brch[0];
        Toast.makeText(this,brnch,Toast.LENGTH_LONG).show();
    }
}
