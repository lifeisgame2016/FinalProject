package com.jcore.service;

import java.math.BigInteger;

public class SimpleAlgorithmFactory {
    public static final Integer ZERO = 0;

    public static SimpleRecursionAlgorithm createSimpleRecursionAlgorithm(AlgorithmType algorithmType) {

        SimpleRecursionAlgorithm algorithm;
        switch(algorithmType) {
            case FACTORIAL: {
                algorithm = SimpleRecursionAlgorithm.<BigInteger>builder()
                        .setPredicate((n) -> n.equals(BigInteger.ZERO))
                        .setDefaultValue(BigInteger.ONE)
                        .setStrategy((n, f) -> {return n.multiply(f.run(n.subtract(BigInteger.ONE)));});
                break;
            }
            case FIBONACCI: {
                algorithm = SimpleRecursionAlgorithm.<BigInteger>builder()
                        .setPredicate((n) -> n.compareTo(BigInteger.valueOf(2)) <= 0)
                        .setDefaultValue(BigInteger.ONE)
                        .setStrategy((n, f) -> {return f.run(n.subtract(BigInteger.ONE)).add(f.run(n.subtract(BigInteger.valueOf(2))));});
                break;
            }
            case SUM: {
            }
            default: {
                algorithm = SimpleRecursionAlgorithm.<Integer>builder()
                        .setPredicate((n) -> n == 0)
                        .setDefaultValue(ZERO)
                        .setStrategy((n, f) -> n + f.run(n - 1));
                break;
            }
        }
        return algorithm;
    }

}
