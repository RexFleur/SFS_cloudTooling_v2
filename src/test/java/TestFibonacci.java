package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFibonacci {

    @Test
    public void testSum() {
        assertEquals(4613732, Fibonacci.sumOfEvens);
    }

}