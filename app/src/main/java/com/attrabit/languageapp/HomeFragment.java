package com.attrabit.languageapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.attrabit.languageapp.interfaces.OnQueryItemSelectedCompletedListener;
import com.attrabit.languageapp.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment implements OnQueryItemSelectedCompletedListener {

    private FragmentHomeBinding binding;
    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        binding.card13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(requireActivity(), R.id.fragmentContainerView).navigate(R.id.action_homeFragment_to_kanjiFragment);
            }
        });
        binding.card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(requireActivity(), R.id.fragmentContainerView).navigate(R.id.action_homeFragment_to_drawFragment);

            }
        });
        // Inflate the layout for this fragment
        return binding.getRoot();
    }

    @Override
    public void onItemSelectedListener(String item) {
//        switch (item) {
//            case Constants.Item.ADD_PRODUCT:
//                Navigation.findNavController(getActivity(), R.id.fragmentContainerView).navigate(R.id.action_dashboardFragment_to_addProductFragment);
//                break;
//
//        }

    }
}