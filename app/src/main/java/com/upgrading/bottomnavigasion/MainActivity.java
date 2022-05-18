package com.upgrading.bottomnavigasion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Activity;
import android.os.Bundle;

import com.upgrading.bottomnavigasion.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new profilFragment());

        binding.bottomNavigasion.setOnItemSelectedListener(item -> {

            switch (item.getItemId()) {
                case R.id.Profil_tab:
                    replaceFragment(new profilFragment());
                    break;
                case R.id.sosmed_tab:
                    replaceFragment(new sosmedFragment());
                    break;
                case R.id.tentang_tab:
                    replaceFragment(new tentangFragment());
                    break;

            }

            return true;
        });
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout,fragment);
        fragmentTransaction.commit();
    }
}