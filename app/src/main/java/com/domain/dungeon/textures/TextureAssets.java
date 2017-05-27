package com.domain.dungeon.textures;


import android.graphics.Bitmap;

import java.util.HashMap;
import java.util.Map.Entry;

public class TextureAssets {
    private static HashMap<Object, Texture> map;
    static {
        map = new HashMap<>();
        for (Entry<Object, Bitmap> entry : BitmapAssets.entrySet()) {
            map.put(entry.getKey(), new Texture(entry.getValue()));
        }
    }

    public static Texture retrieve(Object o) {
        return map.get(o);
    }

}
