package cl.awakelab.ejercicio11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import cl.awakelab.ejercicio11.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.buttonPlane.setOnClickListener(v -> Toast.makeText(this, "modo avión desactivado", Toast.LENGTH_SHORT).show());
        binding.buttonUpdate.setOnClickListener(v -> Toast.makeText(this, "perfil actualizado", Toast.LENGTH_SHORT).show());
        binding.buttonPicture.setOnClickListener(v -> Toast.makeText(this, "imagen guardada en galeria", Toast.LENGTH_SHORT).show());
        binding.buttonUlocked.setOnClickListener(v -> Toast.makeText(this, "nivel 5 desbloqueado", Toast.LENGTH_SHORT).show());
        binding.buttonLevel.setOnClickListener(v -> Toast.makeText(this, "nivel 4 completado", Toast.LENGTH_SHORT).show());
        binding.buttonMusic.setOnClickListener(v -> Toast.makeText(this, "musica pausada", Toast.LENGTH_SHORT).show());

    }








}