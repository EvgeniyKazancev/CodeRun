package ru.ostap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public  void testCalculateSum() {
        assertEquals(9, Main.calculateSum(new int[]{1, 2, 3}, new int[]{5, 6}));
        assertEquals(0, Main.calculateSum(new int[]{1, 2, 3}, new int[]{1, 1}));
        assertEquals(3, Main.calculateSum(new int[]{1}, new int[]{5}));
        assertEquals(10, Main.calculateSum(new int[]{10}, new int[]{20, 15}));
        assertEquals(0, Main.calculateSum(new int[]{5}, new int[]{5}));
    }
    @Test
    public void testEdgeCase() {

        assertEquals(0, Main.calculateSum(new int[]{1}, new int[]{1}));
        assertEquals(1, Main.calculateSum(new int[]{1}, new int[]{2}));
    }

}