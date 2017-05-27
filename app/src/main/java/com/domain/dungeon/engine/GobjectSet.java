package com.domain.dungeon.engine;

import android.graphics.Bitmap;

import com.domain.dungeon.textures.Texture;

import java.util.ArrayList;


public class GobjectSet {
    private ArrayList<Gobject> gobjects;

    public GobjectSet() {
        gobjects = new ArrayList<>();
    }

    public void add(Gobject g) {
        gobjects.add(g);
    }

    public ArrayList<Texture> getTextures() {
        ArrayList<Texture> textures = new ArrayList<>();
        for (Gobject g : gobjects) {
            textures.add(g.getTexture());
        }
        return textures;
    }
}
