package com.domain.dungeon.textures;

import android.graphics.Bitmap;
import android.graphics.Rect;


public class Texture {
    private Bitmap bitmap;
    private int width;
    private int height;
    private Rect rect;

    public Texture(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.width = bitmap.getWidth();
        this.height = bitmap.getHeight();
        this.rect = new Rect(0, 0, width, height);
    }

    public Bitmap getBitmap() {
        return this.bitmap;
    }

    public Rect getRect() {
        return this.rect;
    }
}
