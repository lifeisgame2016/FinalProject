package com.jcore.service;

@FunctionalInterface
interface ReturnStrategy<T> {
    T calc(T n, SimpleRecursionAlgorithm<T> me);
}

