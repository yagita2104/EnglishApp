
package com.yagita.englishapp.activity.settings;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.yagita.englishapp.R;

public class FeedbackScreen extends AppCompatActivity {
    ImageView btnBack;
    Button btnSendFeedback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_screen);
        getWidget();
        addAction();
    }

    private void getWidget() {
        btnBack = findViewById(R.id.btnBackFeedback);
        btnSendFeedback = findViewById(R.id.btnSendFeedback);
    }

    private void addAction() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });
        btnSendFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FeedbackScreen.this, "Cảm ơn phản hồi của bạn", Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        });
    }
}