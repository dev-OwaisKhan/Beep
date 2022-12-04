package com.example.beep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.MultiAutoCompleteTextView;

import java.sql.Array;

public class Create_notification extends AppCompatActivity {

    EditText subject,message;
    ImageButton cancel;
    private MultiAutoCompleteTextView branch;
    String [] brnch ={"MACT","CTIS","AI","DS","SE","CSE"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_notification);

        subject = findViewById(R.id.notification_name);
        message = findViewById(R.id.notification_message);
        branch = findViewById(R.id.select_branch);
        cancel = findViewById(R.id.cancel);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,brnch);
        branch.setAdapter(adapter);

        branch.setThreshold(1);
        branch.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}