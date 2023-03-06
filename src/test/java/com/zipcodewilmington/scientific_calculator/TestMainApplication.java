package com.zipcodewilmington.scientific_calculator;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by leon on 2/9/18.
 */
public class TestMainApplication {
    @Test
    public void testIntegerAddition() {
        // : Given
        int numberA = 20;
        int numberB = 7;
        int expected = 27;
        // : When
        int actual = Calculator.add(numberA, numberB);
        // : Then
        assertEquals(expected, actual);
    }
    }

