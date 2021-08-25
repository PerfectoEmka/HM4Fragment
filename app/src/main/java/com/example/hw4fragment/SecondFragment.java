package com.example.hw4fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements SecondFragmentAdapter.OnClick {

    private RecyclerView recyclerView;
    private SecondFragmentAdapter adapter;
    private ArrayList<Songs> list;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.song_rv);
        adapter = new SecondFragmentAdapter();
        adapter.setList(list, this);
        recyclerView.setAdapter(adapter);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new Songs("Blank Space", "Taylor Swift", "3:22"));
        list.add(new Songs("Blank Space", "Taylor Swift", "3:22"));
        list.add(new Songs("Blank Space", "Taylor Swift", "3:22"));
        list.add(new Songs("Blank Space", "Taylor Swift", "3:22"));
        list.add(new Songs("Blank Space", "Taylor Swift", "3:22"));
        list.add(new Songs("Blank Space", "Taylor Swift", "3:22"));
        list.add(new Songs("Blank Space", "Taylor Swift", "3000:22"));
        list.add(new Songs("Blank Space", "Taylor Swift", "3:22"));
        list.add(new Songs("Blank Space", "Taylor Swift", "3:22"));
        list.add(new Songs("Blank Space", "Taylor Swift", "3:22"));
        list.add(new Songs("Blank Space", "Taylor Swift", "3:22"));
        list.add(new Songs("Blank Space", "Taylor Swift", "3:22"));
        list.add(new Songs("Blsdgdsank Space", "Taylor Soft", "9999:22"));
    }

    @Override
    public void onItemClick(Songs songs) {
        Intent intent = new Intent(requireActivity(),MainActivity2.class);
        intent.putExtra("key", songs);
        startActivity(intent);
    }
}