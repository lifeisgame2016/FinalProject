package com.jcore.service;


import com.jcore.rest.controller.MathControllerTest;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import sun.management.counter.Units;

@RunWith(Categories.class)
@Categories.IncludeCategory(Units.class)
@Suite.SuiteClasses({SimpleAlgorithmFactoryTest.class, MathControllerTest.class})
public class RunnerSimpleTest {
}
