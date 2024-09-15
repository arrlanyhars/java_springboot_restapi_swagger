package com.sig.sig_sisi_rest_api.repository;

import com.sig.sig_sisi_rest_api.entity.CustomerSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerSummaryRepository extends JpaRepository<CustomerSummary, Long> {
}
