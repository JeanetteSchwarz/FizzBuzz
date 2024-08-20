package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
@Test
void play_shouldReturn1_whenCalledWith1(){
    //GIVEN
    int number = 1;
    String expected = "1";
    //WHEN
    String actual = FizzBuzz.play(number);
    //THEN
    assertEquals(expected, actual);
}

    @Test
    void play_shouldReturn4_whenCalledWith4(){
        //GIVEN
        int number = 4;
        String expected = "4";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizz_whenCalledWith3(){
        //GIVEN
        int number = 3;
        String expected = "Fizz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizz_whenCalledWith6(){
        //GIVEN
        int number = 6;
        String expected = "Fizz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnBuzz_whenCalledWith5(){
        //GIVEN
        int number = 5;
        String expected = "Buzz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnBuzz_whenCalledWith10(){
        //GIVEN
        int number = 10;
        String expected = "Buzz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizzBuzz_whenCalledWith15(){
        //GIVEN
        int number = 15;
        String expected = "FizzBuzz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizzBuzz_whenCalledWith0(){
        //GIVEN
        int number = 0;
        String expected = "FizzBuzz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizzBuzz_whenCalledWithMinus1(){
        //GIVEN
        int number = -1;
        String expected = "-1";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void play_shouldReturnFizzBuzz_whenCalledWithMinus15(){
        //GIVEN
        int number = -15;
        String expected = "FizzBuzz";
        //WHEN
        String actual = FizzBuzz.play(number);
        //THEN
        assertEquals(expected, actual);
    }
}