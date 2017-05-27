package com.domain.dungeon.map;

import com.domain.dungeon.engine.GobjectSet;

import java.util.PriorityQueue;

public class Area {
    private int width;
    private int height;
    private TileSet tiles;

    public Area(int width, int height) {
        tiles = new TileSet(width, height);

        for (int x=0; x < width; x++) {
            for (int y=0; x < height; y++) {
                Tile.Type type;
                if (x == 0 || y == 0 || x == width - 1 || y == height - 1) {
                    type = Tile.Type.WALL;
                } else {
                    type = Tile.Type.FLOOR;
                }
                tiles.setNewTile(x, y, type);
            }
        }

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public GobjectSet getGobjects(int x, int y) {
        return tiles.getTile(x, y).getGobjects();
    }
}
