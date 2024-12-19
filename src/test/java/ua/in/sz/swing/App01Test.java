package ua.in.sz.swing;

import org.junit.jupiter.api.Test;

import java.lang.management.ManagementFactory;


class App01Test {

    @Test
    void isOdd_ShouldReturnTrueForOddNumbers() {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println(name.split("@")[0] + " " + getClass().getSimpleName());
    }
}