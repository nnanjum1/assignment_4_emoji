package com.example.emoji;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnFace=findViewById(R.id.btn_face);
        Button btnHand=findViewById(R.id.btn_hand);

        btnFace.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, FaceEmojiActivity.class);
            startActivity(intent);
        });

        btnHand.setOnClickListener(v->{
            Intent intent = new Intent(MainActivity.this, HandEmojiActivity.class);
            startActivity(intent);
        });


    }
}