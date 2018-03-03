package com.example.android.luxor_tourguide;

/**
 * Created by ahmed on 3/2/2018.
 */

public class Monument {
    private String name;
    private String type;
    private int mImageResourceId;

    public Monument(String name, String type, int mImageResourceId) {
        this.name = name;
        this.type = type;
        this.mImageResourceId = mImageResourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public void setImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}
