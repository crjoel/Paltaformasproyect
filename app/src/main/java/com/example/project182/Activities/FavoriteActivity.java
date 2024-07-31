package com.example.project182.Activities;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.project182.Adapters.FavoriteAdapter;
import com.example.project182.databinding.ActivityFavoriteBinding;

public class FavoriteActivity extends AppCompatActivity {

    private ActivityFavoriteBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFavoriteBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupRecyclerView();
        loadFavorites();
    }

    private void setupRecyclerView() {
        FavoriteAdapter favoriteAdapter = new FavoriteAdapter();
        binding.recyclerViewFavorites.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerViewFavorites.setAdapter(favoriteAdapter);
    }

    private void loadFavorites() {
        // Aquí debes agregar la lógica para cargar los elementos favoritos
        // Por ejemplo: favoriteAdapter.submitList(favoriteItems);
    }
}
