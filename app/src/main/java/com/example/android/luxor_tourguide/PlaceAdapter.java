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

public class PlaceAdapter extends ArrayAdapter<Place> {

    private int mColorResourceId;

    public PlaceAdapter(Activity context, ArrayList<Place> word, int color) {
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

        Place currentPlace = getItem(position);

        LinearLayout linearLayout = listItemView.findViewById(R.id.linear_layout);
        linearLayout.setBackgroundColor(mColorResourceId);

        ImageView locationPhotoImageView = listItemView.findViewById(R.id.place_photo_image_view);
        locationPhotoImageView.setImageResource(currentPlace.getImageResourceId());

        TextView nameTextView = listItemView.findViewById(R.id.place_name_text_view);
        nameTextView.setText(currentPlace.getName());

        TextView typeTextView = listItemView.findViewById(R.id.place_type_text_view);
        typeTextView.setText(currentPlace.getType());

        return listItemView;
    }
}
