package com.jcore.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class MathServiceImpl implements MathService {

    @Override
    public String factoria(Integer number){
        SimpleRecursionAlgorithm fac = SimpleAlgorithmFactory.createSimpleRecursionAlgorithm(AlgorithmType.FACTORIAL);
        return  fac.run(BigInteger.valueOf(number)).toString();
    }

    @Override
    public String fibonacci(Integer number){
        SimpleRecursionAlgorithm fib = SimpleAlgorithmFactory.createSimpleRecursionAlgorithm(AlgorithmType.FIBONACCI);
        return  fib.run(BigInteger.valueOf(number)).toString();
    }





}
