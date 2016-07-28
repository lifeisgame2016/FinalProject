package com.jcore.service;

import java.util.function.Predicate;

class SimpleRecursionAlgorithm<T> {

    private Predicate<T> predicate;
    private T defaultValue;
    private ReturnStrategy<T> strategy;

    public static <T> SimpleRecursionAlgorithm<T> builder(){
        return new SimpleRecursionAlgorithm<T>();
    }

    private SimpleRecursionAlgorithm(){}

    public SimpleRecursionAlgorithm<T> setPredicate(Predicate<T> predicate) {
        this.predicate = predicate;
        return this;
    }

    public SimpleRecursionAlgorithm<T> setDefaultValue(T defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    public SimpleRecursionAlgorithm<T> setStrategy(ReturnStrategy<T> strategy) {
        this.strategy = strategy;
        return this;
    }

    public T run(T n){
        if (predicate.test(n)){
            return defaultValue;
        }
        return strategy.calc(n, this);
    }
}
