package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mBut;//for media

    public Word(String defaultTranslation, String miwokTranslation,int B) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mBut=B;
    }
    public Word(String defaultTranslation, String miwokTranslation,int i,int B) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId=i;
        mBut=B;
    }
    public String getDefaultTranslation()
    {
        return mDefaultTranslation;
    }
    public String getMiwokTranslation()
    {
        return mMiwokTranslation;
    }
    public int getImageResourceId()
    {
        return mImageResourceId;
    }
    public int getBut(){ return mBut;}
    public boolean hasImage()
{
        return mImageResourceId!=NO_IMAGE_PROVIDED;
}
}
