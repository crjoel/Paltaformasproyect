package com.example.project182.Activities;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.project182.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {

    private ActivityProfileBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        loadProfileData();
    }

    private void loadProfileData() {
        // Aquí debes agregar la lógica para cargar los datos del perfil del usuario
        // Por ejemplo: binding.textViewName.setText(userName);
        //              binding.textViewEmail.setText(userEmail);
    }
}
