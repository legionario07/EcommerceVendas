package com.example.paulinho.ecommercevendas.telas;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.paulinho.ecommercevendas.R;

public class ScreenSlidePageFragment extends Fragment {

    public ScreenSlidePageFragment() {
        // Required empty public constructor
    }

    public static ScreenSlidePageFragment newInstance(String param1, String param2) {
        ScreenSlidePageFragment fragment = new ScreenSlidePageFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_screen_slide_page, container, false);

        return rootView;
    }

}
