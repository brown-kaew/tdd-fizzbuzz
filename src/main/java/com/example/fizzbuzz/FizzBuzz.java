package com.example.fizzbuzz;

public class FizzBuzz {

    public static String map(int i) {

        if (isFizzBuzz(i)) {
            return "FizzBuzz";
        }

        if (isBuzz(i)) {
            return "Buzz";
        }
        if (isFizz(i)) {
            return "Fizz";
        }
        return "" + i;
    }

    private static boolean isFizzBuzz(int i) {
        return isFizz(i) && isBuzz(i);
    }

    private static boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    private static boolean isFizz(int i) {
        return i % 3 == 0;
    }
}
