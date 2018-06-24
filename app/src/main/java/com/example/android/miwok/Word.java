package com.example.android.miwok;

public class Word {
    private String mEnglishWord;
    private String mMiwokWord;

    //Constructor
    public Word(String englishWord, String miwokWord) {
        mEnglishWord = englishWord;
        mMiwokWord = miwokWord;
    }

    public String getmEnglishWord() {
        return mEnglishWord;
    }

    public String getmMiwokWord() {
        return mMiwokWord;
    }
}
