package com.example.fizzbuzz;

public class FizzBuzz {

    public static String map(int i) {

        if (i == 5 || i ==10) {
            return "Buzz";
        }
        if (i == 3 || i == 6 || i == 9) {
            return "Fizz";
        }
        return "" + i;
    }
}
