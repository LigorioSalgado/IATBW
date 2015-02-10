package com.example.devf.pushnoti;

import android.os.Environment;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * Created by ligorioedwin on 08/02/2015.
 */
public class WRITE_EXTERNAL_STORAGE {
    public static boolean isExternalStorageReadOnly() {
        String extStorageState = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED_READ_ONLY.equals(extStorageState)) {
            return true;
        }
        return false;
    }

    public static boolean isExternalStorageAvailable() {
        String extStorageState = Environment.getExternalStorageState();
        if (Environment.MEDIA_MOUNTED.equals(extStorageState)) {
            return true;
        }
        return false;
    }

    public void writeFile(String filename, String textfile){
        try {
            if (isExternalStorageAvailable() && !isExternalStorageReadOnly()) {
                File file = new File(Environment.getExternalStorageDirectory(), filename );
                OutputStreamWriter outw = new OutputStreamWriter(new FileOutputStream(file));
                outw.write(textfile);
                outw.close();
            }
        } catch (Exception e) {}
    }
}
