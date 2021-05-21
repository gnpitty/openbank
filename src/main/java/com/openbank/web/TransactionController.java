package com.openbank.web;

import com.openbank.service.TransactionService;
import com.openbank.entity.Transaction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/")
public class TransactionController {

    @GetMapping (value="/")//, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody()
    public String hello(){
        return "{'demo':'Hello World'}";
    }

    @RequestMapping("/transactions/{accountNumber}")
    @ResponseBody
    public List<Transaction> transactions(@PathVariable("accountNumber") long accountNumber) {
        TransactionService transactionService = new TransactionService();
        List<Transaction> trans = transactionService.findAllByAccountNumber(accountNumber);

        return trans ;
    }

}
