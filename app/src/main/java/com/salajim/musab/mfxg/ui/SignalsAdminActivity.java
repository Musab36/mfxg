package com.salajim.musab.mfxg.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.salajim.musab.mfxg.R;

public class SignalsAdminActivity extends AppCompatActivity  implements View.OnClickListener {
    EditText username;
    EditText password;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signals_admin);

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
    public void onClick(View view) {

        if (view == submit) {
            getAdmin();
        }

    }

    private void getAdmin() {
        String user = username.getText().toString();
        int pass = Integer.parseInt(password.getText().toString());

        
    }


}
