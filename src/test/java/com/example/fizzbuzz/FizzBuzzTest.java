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


}