package com.example.android.tourguideapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.support.v4.app.Fragment;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by paulcristofari on 20/07/2018.
 */
public class HikesFragment extends Fragment {

    public HikesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);

        TextView category = rootView.findViewById(R.id.category);
        category.setText(R.string.hikes);

        TextView category_description = rootView.findViewById(R.id.category_description);
        category_description.setText(R.string.hikes_description);

        ArrayList<Stuff> stuff = new ArrayList<Stuff>();
        stuff.add(new Stuff(R.string.monte_astu, R.string.monte_astu_detail));
        stuff.add(new Stuff(R.string.monte_incudine, R.string.monte_incudine_detail));
        stuff.add(new Stuff(R.string.monte_renoso, R.string.monte_renoso_detail));
        stuff.add(new Stuff(R.string.monte_rotondo, R.string.monte_rotondo_detail));
        stuff.add(new Stuff(R.string.capu_dorto, R.string.capu_dorto_detail));
        stuff.add(new Stuff(R.string.chapel_santo_eliseo, R.string.monte_astu_detail));

        StuffAdapter adapter = new StuffAdapter(getActivity(), stuff);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}