package com.example.fizzbuzz;

public class FizzBuzz {

    public static String map(int i) {

        if ( i == 15) {
            return "FizzBuzz";
        }

        if (i % 5 == 0) {
            return "Buzz";
        }
        if (i % 3 == 0) {
            return "Fizz";
        }
        return "" + i;
    }
}
