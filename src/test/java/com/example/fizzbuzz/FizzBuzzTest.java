package com.example.fizzbuzz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7, 8})
    void map_inputNonFizzBuzzNum_shouldGetNum(int i) {

        String res = FizzBuzz.map(i);

        Assertions.assertEquals("" + i, res);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void map_inputFizzNum_shouldGetFizz(int i) {

        String res = FizzBuzz.map(i);

        Assertions.assertEquals("Fizz", res);
    }

    @Test
    void map_input5_shouldGetBuzz() {

        String res = FizzBuzz.map(5);

        Assertions.assertEquals("Buzz", res);
    }

    @Test
    void map_input10_shouldGetBuzz() {

        String res = FizzBuzz.map(10);

        Assertions.assertEquals("Buzz", res);
    }

    @Test
    void map_input15_shouldGetFizzBuzz() {

        String res = FizzBuzz.map(15);

        Assertions.assertEquals("FizzBuzz", res);
    }


    @Test
    void map_input30_shouldGetFizzBuzz() {

        String res = FizzBuzz.map(30);

        Assertions.assertEquals("FizzBuzz", res);
    }



}