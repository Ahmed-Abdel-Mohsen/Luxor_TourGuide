package com.example.android.luxor_tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by ahmed on 3/2/2018.
 */

public class MonumentAdapter extends ArrayAdapter<Monument> {

    private int mColorResourceId;

    public MonumentAdapter(Activity context, ArrayList<Monument> word, int color) {
        super(context, 0, word);
        mColorResourceId = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Monument currentMonument = getItem(position);

        LinearLayout linearLayout = listItemView.findViewById(R.id.linear_layout);
        linearLayout.setBackgroundColor(mColorResourceId);

        ImageView imageView = listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentMonument.getImageResourceId());

        TextView nameTextView = listItemView.findViewById(R.id.name_text_view);
        nameTextView.setText(currentMonument.getName());

        TextView typeTextView = listItemView.findViewById(R.id.type_text_view);
        typeTextView.setText(currentMonument.getType());

        return listItemView;
    }
}
