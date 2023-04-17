package com.attrabit.languageapp;

import android.graphics.Path;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.attrabit.languageapp.canvas.MyCanvas;
import com.attrabit.languageapp.databinding.FragmentDrawBinding;
import com.attrabit.languageapp.databinding.FragmentKanjiBinding;

import pk.farimarwat.abckids.AbcdkidsListener;


public class DrawFragment extends Fragment {

    private FragmentDrawBinding binding;
    private MyCanvas myCanvas;

    public DrawFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentDrawBinding.inflate(inflater, container, false);

        myCanvas = new MyCanvas(requireActivity());
//        binding.relaID.addView(myCanvas);

        Path path = new Path();
        int width = 420;
        int height = 420;

        path.moveTo(width*0.19f,height*0.9f);
        path.lineTo(width*0.45f,height*0.08f);

        path.moveTo(width*0.46f,height*0.08f);
        path.lineTo(width*0.76f,height*0.9f);

        path.moveTo(width*0.32f,height*0.62f);
        path.lineTo(width*0.62f,height*0.62f);
        binding.tlview.addListener(new AbcdkidsListener() {
            @Override
            public void onDotTouched(float v) {

            }

            @Override
            public void onSegmentFinished() {

            }

            @Override
            public void onTraceFinished() {

            }
        });

        // Inflate the layout for this fragment
        return binding.getRoot();
    }
}