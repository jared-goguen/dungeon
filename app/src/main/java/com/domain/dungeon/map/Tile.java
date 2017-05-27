package com.domain.dungeon.map;

import com.domain.dungeon.engine.Gobject;
import com.domain.dungeon.engine.GobjectSet;
import com.domain.dungeon.textures.TextureAssets;


public class Tile {
    private Type type;
    private GobjectSet gobjects;

    public enum Type {
        WALL, FLOOR
    }

    public Tile(Type type) {
        this.type = type;
        this.gobjects = new GobjectSet();

        Gobject base = new Gobject(TextureAssets.retrieve(type));
        gobjects.add(base);

    }

    public GobjectSet getGobjects() {
        return gobjects;
    }


}
