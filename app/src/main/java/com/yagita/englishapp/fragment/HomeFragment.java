package com.yagita.englishapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.yagita.englishapp.R;
import com.yagita.englishapp.activity.home.ContributeProfileScreen;
import com.yagita.englishapp.activity.home.ExerciseScreen;
import com.yagita.englishapp.activity.home.StatisticScreen;
import com.yagita.englishapp.activity.home.VocabScreen;

public class HomeFragment extends Fragment {
    Button btnVocabulary, btnExercise, btnStatistics, btnContribute;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        getWidget(view);
        addAction();
        return view;
    }
    public void getWidget(View view){
        btnVocabulary = view.findViewById(R.id.btnVocabulary);
        btnExercise = view.findViewById(R.id.btnExercise);
        btnStatistics = view.findViewById(R.id.btnStatistics);
        btnContribute = view.findViewById(R.id.btnContribute);
    }
    public void addAction(){
        btnVocabulary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), VocabScreen.class));
            }
        });
        btnExercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ExerciseScreen.class));
            }
        });
        btnStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), StatisticScreen.class));
            }
        });
        btnContribute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), ContributeProfileScreen.class));
            }
        });
    }
}