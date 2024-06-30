package com.zipcodewilmington.scientificcalculator;

import junit.framework.TestCase;
import org.junit.Test;

public class main extends TestCase {
    @Test
    void fiveFactorial(){
        var factorialTesting = new factorialTesting();
        assertEquals(120, factorialTesting.factorial(5));
    }
}