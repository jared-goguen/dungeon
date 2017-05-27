package com.domain.dungeon.map;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TileSetTest {
    private int width;
    private int height;
    private TileSet instance;
    private Tile floor;
    private Tile wall;


    @Before
    public void setUp() throws Exception {
        width = 2;
        height = 3;
        instance = new TileSet(width, height);
        floor = new Tile(Tile.Type.FLOOR);
        wall = new Tile(Tile.Type.WALL);
    }

    @Test
    public void get_and_set() throws Exception {
        instance.setTile(width-1, height-1, floor);
        Tile retrieved = instance.getTile(width-1, height-1);
        assertEquals(retrieved, floor);

        instance.setTile(0, 0, wall);
        retrieved = instance.getTile(0, 0);
        assertEquals(retrieved, wall);
    }

}