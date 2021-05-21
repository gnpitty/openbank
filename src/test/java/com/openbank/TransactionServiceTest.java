package com.openbank;

import com.openbank.service.TransactionService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TransactionServiceTest {

    @Tag("DEV")
    @Test
    void testTranService()
    {
        System.out.println("======TEST  testTranService=======");
        TransactionService ts = new TransactionService();
        List lista  = ts.findAllByAccountNumber(12345678);
        Assertions.assertTrue(lista.size() > 0);
       ;
    }
}
