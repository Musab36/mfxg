package com.salajim.musab.mfxg.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.salajim.musab.mfxg.R;
import com.salajim.musab.mfxg.models.Lessons;

import java.util.List;
import java.util.Vector;

public class LessonsAdapter extends RecyclerView.Adapter<LessonsAdapter.MyViewHolder> {
    private Context mContext;
    private List<Lessons> lessons;

    public LessonsAdapter(Context mContext, List<Lessons> lessons) {
        this.mContext = mContext;
        this.lessons = lessons;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.lessons_view, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.webView.loadData(lessons.get(position).getLinks(), "text/html", "utf-8");
    }

    @Override
    public int getItemCount() {
        return lessons.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private Context mContext;
        WebView webView;

        public MyViewHolder(View itemView) {
            super(itemView);
            mContext = itemView.getContext();

            webView = (WebView) itemView.findViewById(R.id.videos);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.setWebChromeClient(new WebChromeClient() {

            });
        }
    }
}
