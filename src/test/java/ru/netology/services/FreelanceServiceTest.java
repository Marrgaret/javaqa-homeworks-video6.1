package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelanceServiceTest {
    @Test
    public void testCalculate1() {
        FreelanceService service = new FreelanceService();
        int actual = service.calculater(10_000, 3_000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testCalculate2() {
        FreelanceService service = new FreelanceService();
        int actual = service.calculater(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }
}