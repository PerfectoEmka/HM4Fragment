package com.example.hw4fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SecondFragmentAdapter extends RecyclerView.Adapter<SecondFragmentAdapter.ViewHolder> {

    private ArrayList<Songs> list;
    private OnClick onClick;

    public void setList(ArrayList<Songs> list, OnClick onClick){
        this.list = new ArrayList<>();
        this.list.addAll(list);
        this.onClick = onClick;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.songs_item_rv, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView song, author, duration, position;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            song = itemView.findViewById(R.id.song_tv);
            author = itemView.findViewById(R.id.author_tv);
            duration = itemView.findViewById(R.id.duration_tv);
            position = itemView.findViewById(R.id.position_tv);
        }

        public void onBind(Songs songs) {
            song.setText(songs.getSong());
            author.setText(songs.getAuthor());
            duration.setText(songs.getDuration());
            position.setText(String.valueOf(list.indexOf(songs)+1));
            itemView.setOnClickListener(view -> {
                onClick.onItemClick(songs);
            });
        }
    }

    public interface OnClick{
        void onItemClick(Songs songs);
    }

}
