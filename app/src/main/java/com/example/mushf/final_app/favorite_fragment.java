package com.example.mushf.final_app;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class favorite_fragment extends Fragment {

    public favorite_fragment() {
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
        View view= inflater.inflate(R.layout.fragment_favorite_fragment, container, false);

        final ViewPager viewPager=(ViewPager)view.findViewById(R.id.viewpager);
        TabLayout tabbLayout= (TabLayout) view.findViewById(R.id.tablayot);

        tabAdapter adapter=new tabAdapter(getActivity().getSupportFragmentManager());

        viewPager.setAdapter(adapter);
        tabbLayout.setupWithViewPager(viewPager);

        return view;
    }


}
