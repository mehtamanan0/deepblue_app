package com.example.shilpika.myapplication;

/**
 * Created by Shilpika on 24/11/18.
 */

import android.util.Log;
import com.google.gson.annotations.SerializedName;
public class Img_Pojo {

    @SerializedName("image")
    private String Image;


    @SerializedName("response")
    private String Response;

    public String getResponse() {
        return Response;
    }
}

