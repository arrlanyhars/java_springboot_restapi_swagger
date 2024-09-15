package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.TransactionItem;
import com.sig.sig_sisi_rest_api.repository.TransactionItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionItemService {

    @Autowired
    private TransactionItemRepository transactionItemRepository;

    public List<TransactionItem> getAllTransactionItems() {
        return transactionItemRepository.findAll();
    }

    public TransactionItem getTransactionItemById(Long id) {
        return transactionItemRepository.findById(id).orElse(null);
    }

    public TransactionItem saveTransactionItem(TransactionItem transactionItem) {
        return transactionItemRepository.save(transactionItem);
    }

    public void deleteTransactionItem(Long trxi_id) {
        transactionItemRepository.deleteById(trxi_id);
    }
}
