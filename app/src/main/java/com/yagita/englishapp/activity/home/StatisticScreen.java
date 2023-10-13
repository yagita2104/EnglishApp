package com.yagita.englishapp.activity.home;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.yagita.englishapp.R;

public class StatisticScreen extends AppCompatActivity {
    ImageView btnBackStatistics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistic_screen);
        getWidget();
        addAction();
    }
    private void getWidget() {
        btnBackStatistics = findViewById(R.id.btnBackStatistic);
    }
    private void addAction() {
        btnBackStatistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
    }
}