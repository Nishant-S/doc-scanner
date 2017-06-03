package com.example.nishantranjansingh.myapplication;

import android.net.Uri;

public interface IScanner {

    void onBitmapSelect(Uri uri);

    void onScanFinish(Uri uri);
}
