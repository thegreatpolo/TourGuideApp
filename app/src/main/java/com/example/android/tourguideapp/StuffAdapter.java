package com.example.android.tourguideapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by paulcristofari on 19/07/2018.
 */

public class StuffAdapter extends ArrayAdapter<Stuff> {

    public StuffAdapter(Context context, ArrayList<Stuff> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // We want to get an item in the list
        Stuff object = getItem(position);

        // We find the view to set text
        TextView objectTextView = (TextView) listItemView.findViewById(R.id.object_text);
        objectTextView.setText(object.getItemId());

        TextView objectDetailTextView = (TextView) listItemView.findViewById(R.id.object_detail);
        objectDetailTextView.setText(object.getDetailId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image_tower);
        // Check if an image is provided for this word or not
        if (object.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(object.getImageId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else {
            // Otherwise hide the ImageView (set visibility to GONE)
            imageView.setVisibility(View.GONE);
        }

        return listItemView;
    }
}

