package com.salajim.musab.mfxg.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.salajim.musab.mfxg.R;
import com.salajim.musab.mfxg.adapters.LessonsAdapter;
import com.salajim.musab.mfxg.models.Lessons;

import java.util.Vector;

public class LessonsActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    Vector<Lessons> lessons = new Vector<>();
    private LessonsAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lessons);

        // Setting up the custom toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.lessonsRecycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Somali
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/DtBUCk_6_AA\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ICaY_wzNHr8\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/cDGhZzMRtOg\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ffqkiZIHZ9g\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/nhDefoDz4sg\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/OEqYMh-EOAI\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/1IFOIDDLBdk\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/FrUXCIDc1fM\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/T4pTwU3hJH4\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Z21MYT_caWM\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/NkZwrpCRqM\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/BUU_cqHz1EU\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ChgO8zmY10A\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/C219uufLdGQ&t=76s\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/vQxNht5ibjg\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Tz6tm9jXnc\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/47xXTYiiG38\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/tmYl6sRp26I\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/RWXshrqkhT8\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/iLoMNF1cK1Y&t=2s\" frameborder=\"0\" allowfullscreen></iframe>"));
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/Ni9T88ANduY\" frameborder=\"0\" allowfullscreen></iframe>"));


        // English
        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/z7538iNe2Pw\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/_FALMKrDwP8\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8U-mPvoOz4Y\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/AV1hsr0EBd4\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-yQCcT1TEkY\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/va6EmhFhhEo\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/2hbSwc04s2A\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/-W3jOvwFtuM\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/ojr8MmrNlbM\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/PUJ0Y7a10J0\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/xJa_12cXJmA\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/brStS5XTL4E\" frameborder=\"0\" allowfullscreen></iframe>"));

        lessons.add(new Lessons("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/rWm-OEkgEk4\" frameborder=\"0\" allowfullscreen></iframe>"));

        mAdapter = new LessonsAdapter(getApplicationContext(), lessons);
        recyclerView.setAdapter(mAdapter);

    }

}
