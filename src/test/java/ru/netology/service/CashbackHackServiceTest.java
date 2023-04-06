package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Test;

public class CashbackHackServiceTest extends TestCase {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainIfAmountLessBorder() {

        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainIfAmountOverBorder() {

        int expected = 999;
        int actual = service.remain(1001);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotRemainIfAmountEqualBorder() {

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }
}