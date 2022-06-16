package com.example.beep;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Home extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

       /* toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
*/
        //getSupportActionBar().setDisplayShowTitleEnabled(false);
    }

   /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.settings)
        {
            Toast.makeText(this, "settings button", Toast.LENGTH_SHORT).show();
        }
        else if (id == R.id.about)
        {
            Toast.makeText(this, "about button", Toast.LENGTH_SHORT).show();
        }
        return true;
    }*/
}