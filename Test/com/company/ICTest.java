package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class ICTest {

    @Test
    public void addTest() {
        IC test1 = new IC();
        int result1 = test1.add(3,4);
        assertEquals(7,result1);
        result1 = test1.add(2,-5);
        assertEquals(-3,result1);
        result1 = test1.add(-7,0);
        assertEquals(-7,result1);
        result1 = test1.add(-11,11);
        assertEquals(0,result1);
        result1 = test1.add(-4,-1);
        assertEquals(-5,result1);
    }

    @Test
    public void divideTest() {
        IC test2 = new IC();
        float result2 = test2.divide(1,3);
        assertEquals(0.333f,result2,0.001);
        result2 = test2.divide(6,5);
        assertEquals(1.2f,result2,0.001);
        result2 = test2.divide(-19,7);
        assertEquals(-2.714f,result2,0.001);
        result2 = test2.divide(0,-11);
        assertEquals(0.0f,result2,0.001);
        result2 = test2.divide(-1,-1);
        assertEquals(1.0f,result2,0.001);
        try {
            result2 = test2.divide(2,0);
            fail();
        }
        catch (IllegalArgumentException ex){
            assertEquals("Math Error !",ex.getMessage());
        }
    }
}