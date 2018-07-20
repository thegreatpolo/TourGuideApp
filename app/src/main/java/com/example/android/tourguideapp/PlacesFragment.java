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
public class PlacesFragment extends Fragment {

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);

        TextView category = rootView.findViewById(R.id.category);
        category.setText(R.string.places);

        TextView category_description = rootView.findViewById(R.id.category_description);
        category_description.setText(R.string.places_description);

        ArrayList<Stuff> stuff = new ArrayList<Stuff>();
        stuff.add(new Stuff(R.string.bastia, R.string.bastia_detail));
        stuff.add(new Stuff(R.string.porto_vecchio, R.string.porto_vecchio_detail));
        stuff.add(new Stuff(R.string.nonza, R.string.nonza_detail));
        stuff.add(new Stuff(R.string.ajaccio, R.string.ajaccio_detail));
        stuff.add(new Stuff(R.string.corte, R.string.corte_detail));
        stuff.add(new Stuff(R.string.ile_rousse, R.string.ile_rousse_detail));

        StuffAdapter adapter = new StuffAdapter(getActivity(), stuff);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}