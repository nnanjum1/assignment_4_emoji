package com.example.emoji;

import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class FaceEmojiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_face_emoji);
        ExpandableListView expandableListView = findViewById(R.id.emojiExpandableListView);

        String[] title = {
                "Slightly Smiling Face", "Beaming Face with Smiling Eyes",
                "Smiling Face with Heart-Eyes", "Crying Face",
                "Grinning Face with Sweat", "Smiling Face with Sunglasses",
                "Pouting Face", "Thinking Face", "Hugging Face",
                "Partying Face"
        };

        String[][] subtitles = {
                {"Mild Positivity"}, {"Extreme Joy"}, {"Love & Admiration"}, {"Sadness or Disappointment"},
                {"Awkward Relief"}, {"Cool Confidence"}, {"Anger or Frustration"}, {"Contemplation"},
                {"Warmth & Care"}, {"Celebration Mode"}
        };

        Integer[] image = {
                R.drawable.img_1, R.drawable.img_2, R.drawable.img_3, R.drawable.img_4,
                R.drawable.img_5, R.drawable.img_6, R.drawable.img_7, R.drawable.img_8,
                R.drawable.img_9, R.drawable.img_10
        };

        FaceExpandableAdapter adapter = new FaceExpandableAdapter(this, title,subtitles, image);
        expandableListView.setAdapter(adapter);

    }
}