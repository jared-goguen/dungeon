package com.domain.dungeon.textures;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.domain.dungeon.map.Tile;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class BitmapAssets {
    private static HashMap<Object, Bitmap> map = new HashMap<>();
    static {
        map.put(Tile.Type.WALL, BitmapFactory.decodeFile("res/drawable/wall.png"));
        map.put(Tile.Type.FLOOR, BitmapFactory.decodeFile("res/drawable/floor.png"));
    }

    public static Bitmap retrieve(Object o) {
        return map.get(o);
    }

    public static Set<Map.Entry<Object, Bitmap>> entrySet() {
        return map.entrySet();
    }

}
