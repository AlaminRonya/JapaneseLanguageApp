package com.attrabit.languageapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.attrabit.languageapp.adapter.KanjiListAdapter;
import com.attrabit.languageapp.databinding.FragmentHomeBinding;
import com.attrabit.languageapp.databinding.FragmentKanjiBinding;
import com.attrabit.languageapp.model.ListData;

import java.util.ArrayList;


public class KanjiFragment extends Fragment {
    KanjiListAdapter listAdapter;
    ArrayList<ListData> dataArrayList = new ArrayList<>();
    ListData listData;

    private FragmentKanjiBinding binding;
    public KanjiFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentKanjiBinding.inflate(inflater, container, false);

        int[] imageList = {R.drawable.kanji, R.drawable.kanji, R.drawable.kanji, R.drawable.kanji, R.drawable.kanji, R.drawable.kanji, R.drawable.kanji};
        int[] ingredientList = {R.string.pastaIngredients, R.string.maggiIngredients,R.string.cakeIngredients,R.string.pancakeIngredients,R.string.pizzaIngredients, R.string.burgerIngredients, R.string.friesIngredients};
        int[] descList = {R.string.pastaDesc, R.string.maggieDesc, R.string.cakeDesc,R.string.pancakeDesc,R.string.pizzaDesc, R.string.burgerDesc, R.string.friesDesc};
        String[] nameList = {"Kanji", "Kanji", "Kanji", "Kanji", "Kanji","Kanji", "Kanji"};
        String[] timeList = {"30 ", "2 ", "45 ","10 ", "60 ", "45 ", "30 "};
        for (int i = 0; i < imageList.length; i++){
            listData = new ListData(nameList[i], timeList[i], ingredientList[i], descList[i], imageList[i]);
            dataArrayList.add(listData);
        }
        listAdapter = new KanjiListAdapter(requireActivity(), dataArrayList);
        binding.listview.setAdapter(listAdapter);

        return binding.getRoot();
    }
}