package com.example.edz.identiticard;

import android.content.Context;

import java.io.File;

//liuyang
public class DataFileUtil {
    public static File getSaveFile(Context context) {
        return new File(context.getFilesDir(), "pic.jpg");

    }
}
