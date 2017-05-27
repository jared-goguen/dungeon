package com.domain.dungeon.map;

import com.domain.dungeon.util.RectangleArray;


public class TileSet {
    private int width;
    private int height;
    private RectangleArray<Tile> tiles;

    public TileSet(int width, int height) {
        this.width = width;
        this.height = height;
        tiles = new RectangleArray(Tile.class, width, height);
    }

    public void setTile(int x, int y, Tile tile) {
        tiles.set(x, y, tile);
    }

    public void setNewTile(int x, int y, Tile.Type type) {
        Tile tile = new Tile(type);
        setTile(x, y, tile);
    }

    public Tile getTile(int x, int y) {
        return tiles.get(x, y);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
