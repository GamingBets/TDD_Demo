package com.example.andre.unittestexample;

import junit.framework.TestCase;

import org.junit.Test;

/**
 * Created by Andre on 25.04.2016.
 */
public class CalculatorTest extends TestCase {

    private Calculator calc;

    public void setUp() throws Exception {
        super.setUp();
        calc = new Calculator();
    }

    @Test
    public void test_add(){
        calc.add(4, 2);
        assertEquals(6, calc.getResult());
    }

    @Test
    public void test_subtract(){
        calc.sub(4, 2);
        assertEquals(2, calc.getResult());
    }

    @Test
    public void test_multiply(){
        calc.mult(4, 2);
        assertEquals(8, calc.getResult());
    }

    @Test
    public void test_divide(){
        calc.div(4, 2);
        assertEquals(2, calc.getResult());
    }
}

