package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class WordAdapter extends ArrayAdapter<Word> {
    @BindView(R.id.english_word)
    TextView englishWord;
    @BindView(R.id.miwok_word)
    TextView miwokWord;

    public WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> words) {
        super(context, 0, words);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Word word = getItem(position);
        ButterKnife.bind(this, listItemView);
        englishWord.setText(word.getmEnglishWord());
        miwokWord.setText(word.getmMiwokWord());

        return listItemView;
    }
}