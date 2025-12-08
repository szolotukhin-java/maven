package ua.in.sz.swing;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

@Slf4j
class App07IT {
    @Test
    @SneakyThrows
    void test_01() {
        TimeUnit.SECONDS.sleep(1L);
        log.info("test 03 01");
    }

    @Test
    @SneakyThrows
    void test_02() {
        TimeUnit.SECONDS.sleep(1L);
        log.info("test 03 02");
    }

    @Test
    @SneakyThrows
    void test_03() {
        TimeUnit.SECONDS.sleep(1L);
        log.info("test 03 03");
    }
}