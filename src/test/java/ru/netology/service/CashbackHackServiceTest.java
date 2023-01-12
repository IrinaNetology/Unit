package ru.netology.service;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void testRemainBelowBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 800;

        int expected = 200;
        int actual = service.remain(amount);

        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void testRemainEquallyBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void testRemainBellowBoundary() {

        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(expected,actual);
    }
}

