package com.Euler;

import java.util.ArrayList;
import java.util.Iterator;

public class FiveAndThree {

    public int Solve() {
        System.out.println(" \n#1: If we list all the natural numbers below 10 that are multiples of 3 or 5, " +
                "we get 3, 5, 6 and 9. The sum of these multiples is 23.\nFind the sum of all the " +
                "multiples of 3 or 5 below 1000.\n");

        int x = 0;
        ArrayList<Integer> y = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            if((i % 3 == 0) || (i % 5 == 0)) y.add(i);
        }
        Iterator<Integer> i = y.iterator();

        while (i.hasNext()) {
            x += i.next();
//            System.out.println(x);
        }

        return x;
    }
}
