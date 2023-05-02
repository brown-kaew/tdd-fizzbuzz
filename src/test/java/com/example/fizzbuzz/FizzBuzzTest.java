package com.example.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {

    @Test
    void map_input1_shouldGet1() {

        String res = FizzBuzz.map(1);

        Assertions.assertEquals("1", res);
    }

    @Test
    void map_input2_shouldGet2() {

        String res = FizzBuzz.map(2);

        Assertions.assertEquals("2", res);
    }
    @Test
    void map_inputFizz_shouldGetFizz() {

        String res = FizzBuzz.map(3);

        Assertions.assertEquals("Fizz", res);
    }



}