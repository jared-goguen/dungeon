package com.domain.dungeon.engine;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

import com.domain.dungeon.map.Area;
import com.domain.dungeon.textures.Texture;

import java.util.ArrayList;

public class Camera {
    private static int DEFAULT_TILES = 10;

    private Area area;
    private double x;
    private double y;
    private double zoom;

    public Camera(Area area) {
        this.area = area;
        this.x = area.getWidth()/2;
        this.y = area.getWidth()/2;
        this.zoom = 1.0;
    }

    public void draw(Canvas canvas) {
        int width = canvas.getWidth();
        int height = canvas.getHeight();

        double number_of_tiles = zoom * DEFAULT_TILES;
        int side;

        if (width < height) {
            side = (int) (width / number_of_tiles);
        } else{
            side = (int) (height / number_of_tiles);
        }

        int x_min = (int) (x - width/(2*side)) + 1;
        int x_max = (int) (x + width/(2*side));

        int y_min = (int) (y - height/(2*side)) + 1;
        int y_max = (int) (y + height/(2*side));

        int x_count = x_max - x_min;
        int y_count = y_max - y_min;

        for (int x_i=0; x_i < x_count; x_i++) {
            for (int y_i=0; y_i < y_count; y_i++) {
                int x_c = x_i + x_min;
                int y_c = y_i + y_min;
                GobjectSet gobjects = area.getGobjects(x_c, y_c);
                ArrayList<Texture> textures = gobjects.getTextures();
                for (Texture texture : textures) {
                    Rect src = texture.getRect();

                    int left = x_i * side;
                    int right = left + side;
                    int top = y_i * side;
                    int bottom = top + side;

                    Rect dst = new Rect(left, top, right, bottom);

                    canvas.drawBitmap(texture.getBitmap(), src, dst, null);
                }
            }
        }


    }
}
