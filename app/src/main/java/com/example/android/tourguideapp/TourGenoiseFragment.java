package com.example.android.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by paulcristofari on 19/07/2018.
 */

public class TourGenoiseFragment extends Fragment {

    public TourGenoiseFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_food, container, false);

        TextView category = rootView.findViewById(R.id.category);
        category.setText(R.string.tour_genoise);

        TextView category_description = rootView.findViewById(R.id.category_description);
        category_description.setText(R.string.tour_genoise_description);

        ArrayList<Stuff> stuff = new ArrayList<Stuff>();
        stuff.add(new Stuff(R.string.santa_maria, R.string.santa_maria_detail, R.drawable.santa_maria));
        stuff.add(new Stuff(R.string.poggio, R.string.poggio_detail, R.drawable.poggio));
        stuff.add(new Stuff(R.string.osse, R.string.osse_detail, R.drawable.osse));
        stuff.add(new Stuff(R.string.seneque, R.string.seneque_detail, R.drawable.seneque));
        stuff.add(new Stuff(R.string.tollare, R.string.tollare_detail, R.drawable.tollare));

        StuffAdapter adapter = new StuffAdapter(getActivity(), stuff);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}