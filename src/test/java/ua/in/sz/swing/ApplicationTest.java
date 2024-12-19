package ua.in.sz.swing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.management.ManagementFactory;

import static org.junit.jupiter.api.Assertions.*;


class ApplicationTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    void isOdd_ShouldReturnTrueForOddNumbers(int number) {
        String name = ManagementFactory.getRuntimeMXBean().getName();
        System.out.println(name.split("@")[0] + " " + getClass().getSimpleName());
    }
}