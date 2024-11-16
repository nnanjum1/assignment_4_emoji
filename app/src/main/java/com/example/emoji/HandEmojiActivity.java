package com.example.emoji;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class HandEmojiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hand_emoji);
        ListView listView = findViewById(R.id.handListView);

        String[] title = {
                "Thumbs Up","Thumbs Down",
                "Waving Hand","Raising Hands",
                "Crossed Fingers", "Victory Hand","Clapping Hands",
                "Palms Up Together",
        };
        String[] subtitle ={
                "Approval or Agreement","Disapproval",
                "Hello or Goodbye","Celebration",
                "Wishing Luck", "Peace or Victory","Applause",
                "Contemplation","Warmth & Care",
                "Offering or Prayer",
        };

        Integer[] image = {R.drawable.img_11, R.drawable.img_12, R.drawable.img_13, R.drawable.img_14,
                R.drawable.img_15, R.drawable.img_16, R.drawable.img_17, R.drawable.img_18};


        HandAdapter adapter = new HandAdapter(this, title, subtitle, image);

        listView.setAdapter(adapter);
    }
}