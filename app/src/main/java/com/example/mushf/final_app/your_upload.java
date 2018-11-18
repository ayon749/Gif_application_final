package com.example.mushf.final_app;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;


public class your_upload extends Fragment {

    public your_upload() {
        // Required empty public constructor
    }




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_your_upload, container, false);
        Toast.makeText(getActivity(), "You are in My Uploads" ,
                Toast.LENGTH_SHORT).show();
        GridView gridview = (GridView)view. findViewById(R.id.gridview);
        Integer[]gif={R.drawable.giphy,R.drawable.giphy,R.drawable.giphy,R.drawable.giphy,R.drawable.giphy,R.drawable.giphy,R.drawable.giphy,
                R.drawable.giphy,R.drawable.giphy,R.drawable.giphy};
        gridview.setAdapter(new ImageAdapter(getActivity(),gif));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(getActivity(), "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event





}
