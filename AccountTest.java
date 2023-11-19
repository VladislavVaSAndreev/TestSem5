package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    void testGetAmount1() {
        Account account = new Account();
        account.put(10);
        int actualSum = account.getAmount();
        int expectedSum = 10;

        Assertions.assertEquals(expectedSum, actualSum );
    }

    @Test
    void testGetAmount2() {
        Account account = new Account();
        account.put(10);
        account.take(3);
        int actualSum = account.getAmount();
        int expectedSum = 7;

        Assertions.assertEquals(expectedSum, actualSum);
    }


}