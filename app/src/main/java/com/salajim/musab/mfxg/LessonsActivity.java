package com.salajim.musab.mfxg;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

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

        mAdapter = new LessonsAdapter(getApplicationContext(), lessons);
        recyclerView.setAdapter(mAdapter);

    }

    // inflating the menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_add, menu);

        return super.onCreateOptionsMenu(menu);
    }

    // Menu actions
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_add) {
            Intent intent = new Intent(this, AddLessonsActivity.class);
            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
