package com.domain.dungeon.engine;


import android.graphics.Bitmap;

import com.domain.dungeon.textures.Texture;

public class Gobject {
    private Texture texture;

    public Gobject(Texture texture) {
        this.texture = texture;
    }

    public Texture getTexture() {
        return texture;
    }
}
