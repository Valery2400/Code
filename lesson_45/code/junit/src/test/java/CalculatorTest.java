package lesson_45.code.junit.src.test.java;

import lesson_45.code.junit.src.main.java.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testSum(){
        Calculator calculator = new Calculator();
        int x = 10;
        int y = 15;

        int expectedResult = 25;

        int actualResult = calculator.sum(x,y);

        assertEquals(expectedResult,actualResult);

    }

}