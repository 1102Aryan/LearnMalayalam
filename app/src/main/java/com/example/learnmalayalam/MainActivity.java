package com.example.learnmalayalam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.learnmalayalam.HelperClass.HomeAdapter.FeaturedAdapter;
import com.example.learnmalayalam.HelperClass.HomeAdapter.GameClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView featureRecycler;
    RecyclerView.Adapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        featureRecycler = findViewById(R.id.game);

        featureRecycler();
    }

    private void featureRecycler() {

        featureRecycler.setHasFixedSize(true);
        featureRecycler.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false));

        ArrayList<GameClass> featuredLocations = new ArrayList<>();
        featuredLocations.add(new GameClass("Vowels", "അ"));
        featuredLocations.add(new GameClass("Consonants", "ക"));
        featuredLocations.add(new GameClass("Dependent Vowels", " ി"));

        adapter = new FeaturedAdapter(featuredLocations);
        featureRecycler.setAdapter(adapter);

    }

    public void bigBrainPage(View view){
        Intent intent = new Intent (this, bigBrainPage.class);
        startActivity(intent);
    }






}