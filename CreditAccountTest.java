package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditAccountTest {
    @Test
    void testGetAmount(){
        CreditAccount creditAccount = new CreditAccount();
        creditAccount.put(100.0);
        creditAccount.take(5);

        double actualSum = creditAccount.getAmount();
        double expectedSum = 89.95;
        Assertions.assertEquals(expectedSum, actualSum);
    }

}