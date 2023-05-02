package com.example.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4})
    void map_input1_shouldGet1(int i) {

        String res = FizzBuzz.map(i);

        Assertions.assertEquals("" + i, res);
    }

    @Test
    void map_input3_shouldGetFizz() {

        String res = FizzBuzz.map(3);

        Assertions.assertEquals("Fizz", res);
    }

    @Test
    void map_input5_shouldGetBuzz() {

        String res = FizzBuzz.map(5);

        Assertions.assertEquals("Buzz", res);
    }

    @Test
    void map_input6_shouldGetFizz() {

        String res = FizzBuzz.map(6);

        Assertions.assertEquals("Fizz", res);
    }



}