package com.domain.dungeon.engine;

import com.domain.dungeon.map.Area;


public class Game {
    private Area area;

    public Game() {
        area = new Area(50, 100);
    }

    public Area getArea() {
        return area;
    }
}
