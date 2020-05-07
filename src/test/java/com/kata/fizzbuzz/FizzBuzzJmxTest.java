package com.kata.fizzbuzz;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzJmxTest
{

    FizzBuzzJmx fizzBuzz = new FizzBuzzJmx();

    @Test
    void fizzbuzzOne()
    {
        assertEquals("1", fizzBuzz.fizzbuzz(1));
    }
}