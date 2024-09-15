package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.TransactionItem;
import com.sig.sig_sisi_rest_api.service.TransactionItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaction_items")
public class TransactionItemController {

    @Autowired
    private TransactionItemService transactionItemService;

    @GetMapping
    public List<TransactionItem> getAllTransactionItems() {
        return transactionItemService.getAllTransactionItems();
    }

    @GetMapping("/{trxi_id}")
    public TransactionItem getTransactionItemById(@PathVariable Long trxi_id) {
        return transactionItemService.getTransactionItemById(trxi_id);
    }

    // @PostMapping
    // public TransactionItem createTransactionItem(@RequestBody TransactionItem transactionItem) {
    //     return transactionItemService.saveTransactionItem(transactionItem);
    // }

    // @PutMapping("/{trxi_id}")
    // public TransactionItem updateTransactionItem(@PathVariable Long trxi_id, @RequestBody TransactionItem transactionItemDetails) {
    //     TransactionItem transactionItem = transactionItemService.getTransactionItemById(trxi_id);
    //     if (transactionItem != null) {
    //         transactionItem.setTrxi_varian_id(transactionItemDetails.getTrxi_varian_id());
    //         transactionItem.setTrxi_qty(transactionItemDetails.getTrxi_qty());
    //         transactionItem.setTrxi_price(transactionItemDetails.getTrxi_price());
    //         transactionItem.setTrxi_updated_at(transactionItemDetails.getTrxi_updated_at());
    //         transactionItem.setTrxi_updated_by(transactionItemDetails.getTrxi_updated_by());
    //         return transactionItemService.saveTransactionItem(transactionItem);
    //     }
    //     return null;
    // }

    @DeleteMapping("/{trxi_id}")
    public void deleteTransactionItem(@PathVariable Long trxi_id) {
        transactionItemService.deleteTransactionItem(trxi_id);
    }
}
