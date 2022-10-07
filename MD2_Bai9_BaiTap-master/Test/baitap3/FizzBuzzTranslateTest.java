package baitap3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void translateTest1() {
        int number = 100;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void translateTest2() {
        int number = 30;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void translateTest3() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void translateTest4() {
        int number = -634;
        String expected = "-634";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }

    @Test
    void translateTest5() {
        int number = 0;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(number);
        assertEquals(expected, result);
    }
}