package com.example.android.miwok;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;


public class WordAdapter extends ArrayAdapter<Word> {
    @BindView(R.id.english_word)
    TextView englishWord;
    @BindView(R.id.miwok_word)
    TextView miwokWord;
    @BindView(R.id.image_view)
    ImageView imageView;
    @BindView(R.id.list_color)
    RelativeLayout relativeLayout;
    private int mColorId;

    WordAdapter(@NonNull Context context, @NonNull ArrayList<Word> words, int colorId) {
        super(context, 0, words);
        mColorId = colorId;
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
        assert word != null;
        englishWord.setText(word.getmEnglishWord());
        miwokWord.setText(word.getmMiwokWord());
        int color = ContextCompat.getColor(getContext(), mColorId);
        relativeLayout.setBackgroundColor(color);
        if (word.hasImage()) {
            imageView.setImageResource(word.getmImageResourceID());
            imageView.setVisibility(View.VISIBLE);
        } else
            imageView.setVisibility(View.GONE);

        return listItemView;
    }
}