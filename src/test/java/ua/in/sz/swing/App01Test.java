package ua.in.sz.swing;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.lang.management.ManagementFactory;
import java.util.concurrent.TimeUnit;

@Slf4j
class App01Test {
    @Test
    @SneakyThrows
    void test_01() {
        TimeUnit.SECONDS.sleep(1L);
        log.info("test 01 01");
    }

    @Test
    @SneakyThrows
    void test_02() {
        TimeUnit.SECONDS.sleep(1L);
        log.info("test 01 02");
    }

    @Test
    @SneakyThrows
    void test_03() {
        TimeUnit.SECONDS.sleep(1L);
        log.info("test 01 03");
//        log.info("test 01 03", new IllegalStateException());
    }
}