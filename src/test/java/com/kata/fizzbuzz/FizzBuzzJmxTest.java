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
        assertEquals("2", fizzBuzz.fizzbuzz(2));
        assertEquals("4", fizzBuzz.fizzbuzz(4));
    }

    @Test
    void fizzbuzzFizz()
    {
        assertEquals("Fizz", fizzBuzz.fizzbuzz(3));
        assertEquals("Fizz", fizzBuzz.fizzbuzz(9));
        assertEquals("Fizz", fizzBuzz.fizzbuzz(18));
    }

    @Test
    void fizzbuzzBuzz()
    {
        assertEquals("Buzz", fizzBuzz.fizzbuzz(5));
        assertEquals("Buzz", fizzBuzz.fizzbuzz(10));
        assertEquals("Buzz", fizzBuzz.fizzbuzz(20));

    }

    @Test
    void fizzbuzz()
    {
        assertEquals("FizzBuzz", fizzBuzz.fizzbuzz(15));
        assertEquals("FizzBuzz", fizzBuzz.fizzbuzz(30));
        assertEquals("FizzBuzz", fizzBuzz.fizzbuzz(45));
    }

}