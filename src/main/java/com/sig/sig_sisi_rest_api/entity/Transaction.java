package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trx_id;

    private Long trx_customer_id;
    private Float trx_total_price;
    private Float trx_discount;
    private Float trx_total_after_discount;
    private LocalDateTime trx_created_at;
    private LocalDateTime trx_updated_at;

    // Getters and Setters

    public Long getTrx_id() {
        return trx_id;
    }

    public void setTrx_id(Long trx_id) {
        this.trx_id = trx_id;
    }

    public Long getTrx_customer_id() {
        return trx_customer_id;
    }

    public void setTrx_customer_id(Long trx_customer_id) {
        this.trx_customer_id = trx_customer_id;
    }

    public Float getTrx_total_price() {
        return trx_total_price;
    }

    public void setTrx_total_price(Float trx_total_price) {
        this.trx_total_price = trx_total_price;
    }

    public Float getTrx_discount() {
        return trx_discount;
    }

    public void setTrx_discount(Float trx_discount) {
        this.trx_discount = trx_discount;
    }

    public Float getTrx_total_after_discount() {
        return trx_total_after_discount;
    }

    public void setTrx_total_after_discount(Float trx_total_after_discount) {
        this.trx_total_after_discount = trx_total_after_discount;
    }

    public LocalDateTime getTrx_created_at() {
        return trx_created_at;
    }

    public void setTrx_created_at(LocalDateTime trx_created_at) {
        this.trx_created_at = trx_created_at;
    }

    public LocalDateTime getTrx_updated_at() {
        return trx_updated_at;
    }

    public void setTrx_updated_at(LocalDateTime trx_updated_at) {
        this.trx_updated_at = trx_updated_at;
    }
}
