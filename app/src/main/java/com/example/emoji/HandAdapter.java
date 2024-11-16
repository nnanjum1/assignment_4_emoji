package com.example.emoji;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class HandAdapter extends BaseAdapter {
    String[] title;
    String[] subtitle;
    Integer[] image;
    Context context;

    public HandAdapter(Context context, String[] title, String[] subtitle, Integer[] image) {

        this.context = context;
        this.title = title;
        this.subtitle = subtitle;
        this.image = image;

    }

    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.hand_emoji, parent, false);

        }
        TextView t = convertView.findViewById(R.id.h_title);
        TextView s = convertView.findViewById(R.id.h_subtitle);
        ImageView imageView = convertView.findViewById(R.id.iv_img);

        imageView.setOnClickListener(v ->
                Toast.makeText(context, "Emoji: " + title[position], Toast.LENGTH_SHORT).show()
        );
        t.setText(title[position]);
        s.setText(subtitle[position]);
        imageView.setImageResource(image[position]);

        return convertView;
    }
}
