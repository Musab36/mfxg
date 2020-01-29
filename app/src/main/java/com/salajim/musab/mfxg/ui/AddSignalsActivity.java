package com.salajim.musab.mfxg.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.salajim.musab.mfxg.R;
import com.salajim.musab.mfxg.models.Signals;

import java.util.ArrayList;
import java.util.List;

public class AddSignalsActivity extends AppCompatActivity implements View.OnClickListener {
    EditText mPair;
    EditText mEntry;
    EditText mTakeProfit;
    EditText mStopLoss;
    Button mSubmit;

    List<Signals> signals;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_signals);

        // Setting up the custom toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mPair = (EditText) findViewById(R.id.pair);
        mEntry = (EditText) findViewById(R.id.entry);
        mTakeProfit = (EditText) findViewById(R.id.takeProfit);
        mStopLoss = (EditText) findViewById(R.id.stopLoss);
        mSubmit = (Button) findViewById(R.id.signalBtn);

        mSubmit.setOnClickListener(this);

        reference = FirebaseDatabase.getInstance().getReference("signals");
        signals = new ArrayList<>();
    }

    @Override
    public void onClick(View v) {

        if (v == mSubmit) {
            addSignals();
        }
    }

    private void addSignals() {
        String pair = mPair.getText().toString().trim();
        String entry = mEntry.getText().toString().trim();
        String takeProfit = mTakeProfit.getText().toString().trim();
        String stopLoss = mStopLoss.getText().toString().trim();

        if(!TextUtils.isEmpty(pair)) {
            String id = reference.push().getKey();

            Signals signal = new Signals(id, pair, entry, takeProfit, stopLoss);
            reference.child(id).setValue(signal);

            mPair.setText("");
            mEntry.setText("");
            mTakeProfit.setText("");
            mStopLoss.setText("");

            Toast.makeText(this, "Signal added successfully", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Fields cannot be empty", Toast.LENGTH_SHORT).show();
        }
    }
}
