package com.example.android.miwok;

public class Word {
    private int mEnglishWord;
    private int mMiwokWord;
    private int mImageResourceID = -1;
    private int mAudioID;

    //Constructor
    Word(int englishWord, int miwokWord, int imageResourceID, int audioID) {
        mEnglishWord = englishWord;
        mMiwokWord = miwokWord;
        mImageResourceID = imageResourceID;
        mAudioID = audioID;
    }

    Word(int englishWord, int miwokWord, int audioID) {
        mEnglishWord = englishWord;
        mMiwokWord = miwokWord;
        mAudioID = audioID;
    }

    public int getmEnglishWord() {
        return mEnglishWord;
    }

    public int getmMiwokWord() {
        return mMiwokWord;
    }

    public int getmImageResourceID() {
        return mImageResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != -1;
    }

    public int getmAudioID() {
        return mAudioID;
    }
}
