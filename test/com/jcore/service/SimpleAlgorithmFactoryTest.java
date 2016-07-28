package com.jcore.service;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import sun.management.counter.Units;

import java.math.BigInteger;

import static org.junit.Assert.*;


public class SimpleAlgorithmFactoryTest {

    @Category(Units.class)
    @Test(timeout = 1000)
    public void createAlgorithmFactorial() throws Exception {
        AlgorithmType algorithmType = AlgorithmType.FACTORIAL;
        SimpleRecursionAlgorithm factorial = SimpleAlgorithmFactory.createSimpleRecursionAlgorithm(algorithmType);
        String expected = String.valueOf(1);
        String result = factorial.run(BigInteger.valueOf(0)).toString();
        assertEquals(expected,result);
    }

    @Category(Units.class)
    @Test(timeout = 1000)
    public void createAlgorithmFibonacci() throws Exception {
        AlgorithmType algorithmType = AlgorithmType.FIBONACCI;
        SimpleRecursionAlgorithm factorial = SimpleAlgorithmFactory.createSimpleRecursionAlgorithm(algorithmType);
        String expected = String.valueOf(1);
        String result = factorial.run(BigInteger.valueOf(0)).toString();
        assertEquals(expected,result);
    }

    @Category(Units.class)
    @Test(timeout = 1000)
    public void createAlgorithmSum() throws Exception {
        AlgorithmType algorithmType = AlgorithmType.SUM;
        SimpleRecursionAlgorithm factorial = SimpleAlgorithmFactory.createSimpleRecursionAlgorithm(algorithmType);
        String expected = String.valueOf(1);
        String result = factorial.run(Integer.valueOf(1)).toString();
        assertEquals(expected,result);
    }



}