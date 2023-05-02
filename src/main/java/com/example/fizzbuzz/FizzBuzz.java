package com.example.fizzbuzz;

public class FizzBuzz {

    public static String map(int i) {

        if (i == 5) {
            return "Buzz";
        }
        if (i == 3) {
            return "Fizz";
        }
        return "" + i;
    }
}
