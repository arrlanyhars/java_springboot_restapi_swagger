package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.Transaction;
import com.sig.sig_sisi_rest_api.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {

    @Autowired
    private TransactionService transactionService;

    @GetMapping
    public List<Transaction> getAllTransactions() {
        return transactionService.getAllTransactions();
    }

    @GetMapping("/{trx_id}")
    public Transaction getTransactionById(@PathVariable Long trx_id) {
        return transactionService.getTransactionById(trx_id);
    }

    @PostMapping
    public Transaction createTransaction(@RequestBody Transaction transaction) {
        return transactionService.saveTransaction(transaction);
    }

    // @PutMapping("/{trx_id}")
    // public Transaction updateTransaction(@PathVariable Long trx_id, @RequestBody Transaction transactionDetails) {
    //     Transaction transaction = transactionService.getTransactionById(trx_id);
    //     if (transaction != null) {
    //         transaction.setTrx_total_price(transactionDetails.getTrx_total_price());
    //         transaction.setTrx_discount(transactionDetails.getTrx_discount());
    //         transaction.setTrx_total_after_discount(transactionDetails.getTrx_total_after_discount());
    //         return transactionService.saveTransaction(transaction);
    //     }
    //     return null;
    // }

    @DeleteMapping("/{trx_id}")
    public void deleteTransaction(@PathVariable Long trx_id) {
        transactionService.deleteTransaction(trx_id);
    }
}
