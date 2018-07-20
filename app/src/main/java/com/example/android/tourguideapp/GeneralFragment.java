package com.example.android.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by paulcristofari on 12/07/2018.
 */

public class GeneralFragment extends Fragment {

    public GeneralFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_general, container, false);

        TextView wiki = rootView.findViewById(R.id.wiki);
        wiki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://en.wikipedia.org/wiki/Corsica";
                Intent wiki = new Intent(Intent.ACTION_VIEW);
                wiki.setData(Uri.parse(url));
                startActivity(wiki);

                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
            }
        });

        /** Carte de Corse :
         *  Eric Gaba – Wikimedia Commons user: Sting
         * CC BY-SA 3.0 **/
        return rootView;
    }
}
