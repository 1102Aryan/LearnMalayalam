package com.example.learnmalayalam.HelperClass.HomeAdapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.learnmalayalam.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.GameViewHolder> {
    ArrayList<GameClass> featuredLocations;

    public FeaturedAdapter(ArrayList<GameClass> featuredLocations) {
        this.featuredLocations = featuredLocations;
    }

    @NonNull
    @Override
    public GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.feature_game, parent, false);
        GameViewHolder gameViewHolder = new GameViewHolder(view);
        return gameViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder holder, int position) {
        GameClass gameClass = featuredLocations.get(position);

        holder.malayalam.setText(gameClass.getMalayalam());
        holder.title.setText(gameClass.getTitle());
    }

    @Override
    public int getItemCount() {
        return featuredLocations.size();
    }

    public static class GameViewHolder extends RecyclerView.ViewHolder{
        TextView title, malayalam;
        public GameViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.game_text);
            malayalam = itemView.findViewById(R.id.vowel_text);
        }
    }
}
