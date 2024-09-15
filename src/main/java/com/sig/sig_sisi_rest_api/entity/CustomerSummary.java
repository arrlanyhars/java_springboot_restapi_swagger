package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer_summary")
public class CustomerSummary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long csum_id;

    private Long csum_customer_id;
    private Float csum_total_purchase;
    private Long csum_total_trx;
    private LocalDateTime csum_created_at;
    private LocalDateTime csum_deleted_at;
    private LocalDateTime csum_updated_at;
    private String csum_created_by;
    private String csum_deleted_by;
    private String csum_updated_by;

    // Getters and Setters

    public Long getCsum_id() {
        return csum_id;
    }

    public void setCsum_id(Long csum_id) {
        this.csum_id = csum_id;
    }

    public Long getCsum_customer_id() {
        return csum_customer_id;
    }

    public void setCsum_customer_id(Long csum_customer_id) {
        this.csum_customer_id = csum_customer_id;
    }

    public Float getCsum_total_purchase() {
        return csum_total_purchase;
    }

    public void setCsum_total_purchase(Float csum_total_purchase) {
        this.csum_total_purchase = csum_total_purchase;
    }

    public Long getCsum_total_trx() {
        return csum_total_trx;
    }

    public void setCsum_total_trx(Long csum_total_trx) {
        this.csum_total_trx = csum_total_trx;
    }

    public LocalDateTime getCsum_created_at() {
        return csum_created_at;
    }

    public void setCsum_created_at(LocalDateTime csum_created_at) {
        this.csum_created_at = csum_created_at;
    }

    public LocalDateTime getCsum_deleted_at() {
        return csum_deleted_at;
    }

    public void setCsum_deleted_at(LocalDateTime csum_deleted_at) {
        this.csum_deleted_at = csum_deleted_at;
    }

    public LocalDateTime getCsum_updated_at() {
        return csum_updated_at;
    }

    public void setCsum_updated_at(LocalDateTime csum_updated_at) {
        this.csum_updated_at = csum_updated_at;
    }

    public String getCsum_created_by() {
        return csum_created_by;
    }

    public void setCsum_created_by(String csum_created_by) {
        this.csum_created_by = csum_created_by;
    }

    public String getCsum_deleted_by() {
        return csum_deleted_by;
    }

    public void setCsum_deleted_by(String csum_deleted_by) {
        this.csum_deleted_by = csum_deleted_by;
    }

    public String getCsum_updated_by() {
        return csum_updated_by;
    }

    public void setCsum_updated_by(String csum_updated_by) {
        this.csum_updated_by = csum_updated_by;
    }
}
