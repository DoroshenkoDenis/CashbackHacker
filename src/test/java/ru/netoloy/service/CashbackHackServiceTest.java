package ru.netoloy.service;

import junit.framework.TestCase;
import org.junit.jupiter.api.Test;

public class CashbackHackServiceTest extends TestCase {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldIfAmountEqualBoundary() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldIfAmountOver() {
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }

    @Test
    public void shouldIfAmountLessBoundary() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

    public void testShouldIfAmountEqualBoundary() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }


    public void testShouldIfAmountOver() {
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);
    }


    public void testShouldIfAmountLessBoundary() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);
    }

}