package com.salajim.musab.mfxg.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.salajim.musab.mfxg.R;

public class LessonsAdminActivity extends AppCompatActivity implements View.OnClickListener {
    EditText username;
    EditText password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons_admin);

        // Setting up the custom toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        username = (EditText) findViewById(R.id.userName);
        password = (EditText) findViewById(R.id.password);
        submit = (Button) findViewById(R.id.submitBtn);

        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == submit) {
            getAdmin();
        }
    }

    private void getAdmin() {
        String user = username.getText().toString();
        int pas = Integer.parseInt(password.getText().toString());

        String adminUser = "Salajim";
        int adminPassword = 31546572;

        if (user != adminUser && pas != adminPassword) {
            Toast.makeText(this, "Incorrect Password or Username", Toast.LENGTH_SHORT).show();
            
        } else {
            Intent intent = new Intent(this, AddLessonsActivity.class);
            startActivity(intent);
        }

    }
}
