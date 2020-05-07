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

    @Test
    void fizzbuzzFizz()
    {
        assertEquals("Fizz", fizzBuzz.fizzbuzz(3));
    }

    @Test
    void fizzbuzzBuzz()
    {
        assertEquals("Buzz", fizzBuzz.fizzbuzz(5));
    }

    @Test
    void fizzbuzz()
    {
        assertEquals("FizzBuzz", fizzBuzz.fizzbuzz(15));
    }
}