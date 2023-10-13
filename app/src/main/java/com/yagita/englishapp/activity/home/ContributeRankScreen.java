package com.yagita.englishapp.activity.home;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.yagita.englishapp.R;

public class ContributeRankScreen extends AppCompatActivity {
    ImageView btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contribute_rank_screen);
        getWidget();
        addAction();
    }

    private void getWidget() {
        btnBack = findViewById(R.id.btnBackRankContribute);
    }

    private void addAction() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}