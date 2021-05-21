package com.openbank.service;

import com.openbank.entity.Transaction;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;




public class TransactionService {

    List <Transaction> createTranList(long accountNumber){

        Transaction t1 = new Transaction();
        t1.setAmount(new BigDecimal("1000.00"));
        t1.setCurrency("US");
        t1.setAccountNumber(accountNumber);
        t1.setDate(new Date());
        t1.setMerchantLogo("logo1.jpg");
        t1.setType("SA");
        t1.setMerchantName("Dummy Store");

        Transaction t2 = new Transaction();
        t2.setAmount(new BigDecimal("500.00"));
        t2.setCurrency("US");
        t2.setAccountNumber(accountNumber);
        t2.setDate(new Date());
        t2.setMerchantLogo("logo2.jpg");
        t2.setType("CA");
        t2.setMerchantName("Pets Store");
        System.out.println("T1:"+t1.toString());
        System.out.println("T2:"+t2.toString());
        TransactionService ts = new TransactionService();
        List<Transaction> tranList = new ArrayList();
        tranList.add(t1);
        tranList.add(t2);
        return tranList;

    }

    public List <Transaction> findAllByAccountNumber(long accountNumber){
        List tranList =createTranList(accountNumber);
        return tranList ;
    }
}
