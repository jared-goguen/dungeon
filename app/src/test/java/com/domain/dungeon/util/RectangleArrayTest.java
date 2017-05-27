package com.domain.dungeon.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class RectangleArrayTest {
    private RectangleArray<String> instance;
    private String string1;
    private String string2;
    private int width;
    private int height;

    @Before
    public void setUp() throws Exception {
        width = 3;
        height = 2;
        string1 = "string 1";
        string2 = "string 2";
        instance = new RectangleArray(String.class, width, height);
    }

    @Test
    public void get_and_set() throws Exception {
        instance.set(0, 1, string1);
        String retrieved = instance.get(0, 1);
        assertEquals(string1, retrieved);

        instance.set(0, 1, string2);
        retrieved = instance.get(0, 1);
        assertEquals(string2, retrieved);

        instance.set(width-1, height-1, string1);
        retrieved = instance.get(width-1, height-1);
        assertEquals(string1, retrieved);

    }

}