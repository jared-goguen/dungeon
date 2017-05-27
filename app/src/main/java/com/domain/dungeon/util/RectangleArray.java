package com.domain.dungeon.util;

import java.lang.reflect.Array;


public class RectangleArray<E> {
    private E[][] array;

    public RectangleArray(Class<E> cls, int width, int height) {
        array = (E[][]) Array.newInstance(cls, width, height);
    }

    public void set(int x, int y, E e) {
        array[x][y] = e;
    }

    public E get(int x, int y) {
        return array[x][y];
    }


}
