package com.domain.dungeon.map;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.util.HashMap;

import android.util.Log;


public class Tile {
    public Type type;
    public int w;
    public int h;


    public enum Type {
        WALL, FLOOR
    }

    public static HashMap<Type, Bitmap> typeBitmapMap = new HashMap<>();

    public static void bindResources(Context context) {
        for (Type type : Type.values()) {
            String name = String.valueOf(type).toLowerCase();
            int resource = context.getResources().getIdentifier(name, "drawable", context.getPackageName());
            Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), resource);
            typeBitmapMap.put(type, bitmap);
        }
    }

    public Tile(int h, int w, Type type) {
        this.h = h;
        this.w = w;
        this.type = type;
    }

    public Bitmap getBitmap() {
        return typeBitmapMap.get(this.type);
    }





}
