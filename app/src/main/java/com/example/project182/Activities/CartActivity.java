package com.example.project182.Activities;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.example.project182.Adapters.CartAdapter;
import com.example.project182.databinding.ActivityCartBinding;

public class CartActivity extends AppCompatActivity {

    private ActivityCartBinding binding;
    private CartAdapter cartAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCartBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupRecyclerView();
        loadCartItems();
    }

    private void setupRecyclerView() {
        cartAdapter = new CartAdapter();
        binding.recyclerViewCart.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerViewCart.setAdapter(cartAdapter);
    }

    private void loadCartItems() {
        // Aquí debes agregar la lógica para cargar los elementos del carrito
        // Por ejemplo: cartAdapter.submitList(cartItems);
    }
}
