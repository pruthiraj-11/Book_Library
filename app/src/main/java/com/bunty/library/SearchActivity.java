package com.bunty.library;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.bunty.library.databinding.ActivitySearchBinding;

import java.util.Objects;

public class SearchActivity extends AppCompatActivity {

    ActivitySearchBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        binding=ActivitySearchBinding.inflate(getLayoutInflater());
        super.onCreate(savedInstanceState);
        setContentView(binding.getRoot());
        Objects.requireNonNull(getSupportActionBar()).hide();

    }
}