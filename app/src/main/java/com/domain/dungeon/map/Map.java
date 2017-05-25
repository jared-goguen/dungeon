package com.domain.dungeon.map;

import java.util.ArrayList;

public class Map {
    public ArrayList<ArrayList<Tile>> tiles;

    public Map(int w, int h) {
        this.tiles = new ArrayList<>();

        for (int wi=0; wi < w; wi++) {
            ArrayList<Tile> row = new ArrayList<>();
            for (int hi=0; hi < h; hi++) {
                Tile tile;
                if (wi == 0 || wi == w-1 || hi == 0 || hi == h-1) {
                    tile = new Tile(hi, wi, Tile.Type.WALL);
                } else {
                    tile = new Tile(hi, wi, Tile.Type.FLOOR);
                }
                row.add(tile);
            }
            this.tiles.add(row);
        }
    }
}
