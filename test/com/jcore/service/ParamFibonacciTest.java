package com.jcore.service;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import sun.management.counter.Units;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParamFibonacciTest {

    private static AlgorithmType algorithm;

    private Integer exitParametr;
    private Integer expectedValue;

    @BeforeClass
    public static void initFactorial(){
        algorithm = AlgorithmType.FIBONACCI;
    }

    public ParamFibonacciTest(Integer exitParametr, Integer expectedValue){
        this.exitParametr = exitParametr;
        this.expectedValue = expectedValue;
    }

    @Parameterized.Parameters(name = "{index} : fibonacci is {0}  expectedValue is {1}")
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {2,1},{5,5},{6,8},{10,55},{14,377}
        });
    }

    @Category(Units.class)
    @Test(timeout = 1000)
    public void paramFactorial(){
        SimpleRecursionAlgorithm factorial = SimpleAlgorithmFactory.createSimpleRecursionAlgorithm(algorithm);
        String expected = expectedValue.toString();
        String result = factorial.run(BigInteger.valueOf(exitParametr)).toString();
        assertEquals(expected,result);
    }

}
