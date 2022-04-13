package com.sdk.proverbsapp.manager;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;

public class MyClipBoardManager {
    private final Context context;

    public MyClipBoardManager(Context context) {
        this.context = context;
    }

    public void copyClip(String text) {
        ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
        ClipData clip = ClipData.newPlainText("text", text);
        clipboardManager.setPrimaryClip(clip);
        clip.getDescription();
    }
}
