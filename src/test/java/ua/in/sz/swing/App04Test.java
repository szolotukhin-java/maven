package ua.in.sz.swing;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
class App04Test {
    @Test
    void test_01() {
        log.info("property my.forkNumber: [{}]", System.getProperty("my.forkNumber"));
    }
}