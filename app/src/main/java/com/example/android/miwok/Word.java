package com.example.android.miwok;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private int mAudioResourseId;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation ,String miwokTanslation,int audioResourseId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTanslation;
        mAudioResourseId=audioResourseId;
    }

    public Word(String defaultTranslation ,String miwokTanslation,int imageResourseId,int audioResourseId){
        mDefaultTranslation=defaultTranslation;
        mMiwokTranslation=miwokTanslation;
        mImageResourceId=imageResourseId;
        mAudioResourseId=audioResourseId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation(){
        return mMiwokTranslation;
    }


    /**
     * Return the image resource ID of the word.
     */
    public int getmImageId(){ return mImageResourceId;}

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getmAudioResourseId() {return mAudioResourseId;}
}
