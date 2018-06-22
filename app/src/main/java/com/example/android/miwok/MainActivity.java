package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.numbers)
    TextView numbers;
    @BindView(R.id.family)
    TextView family;
    @BindView(R.id.colors)
    TextView colors;
    @BindView(R.id.phrases)
    TextView phrases;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file

        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        // For Numbers Activity
        numbers.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), NumbersActivity.class);
            startActivity(intent);
        });
        //For Family Activity
        family.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), FamilyActivity.class);
            startActivity(intent);
        });
        //For Colors Activity
        colors.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), ColorsActivity.class);
            startActivity(intent);
        });
        //For Phrases Activity
        phrases.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), PhrasesActivity.class);
            startActivity(intent);
        });
    }
}
