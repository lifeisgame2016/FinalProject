package com.jcore.rest.controller;

import com.jcore.model.Message;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import sun.management.counter.Units;

import static org.junit.Assert.*;


public class MathControllerTest {
    private static MathController mathController;

    @BeforeClass
    public static void initMath(){
        mathController = new MathController();
    }

    @Category(Units.class)
    @Test(expected = IllegalArgumentException.class)
    public void factorialException()  {
        Integer exitValue = -2;
        Message value = mathController.factorial(exitValue);
    }

    @Category(Units.class)
    @Test(expected = IllegalArgumentException.class)
    public void fibonacciException() {
        Integer exitValue = -8;
        Message value = mathController.fibonacci(exitValue);

    }


}