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
    private String trx_invoice;
    private Float trx_total_price;
    private Float trx_discount_delivery;
    private Float trx_discount_item;
    private Float trx_total_discount;
    private Long trx_do_id;
    private LocalDateTime trx_created_at;
    private LocalDateTime trx_updated_at;
    private LocalDateTime trx_deleted_at;
    private String trx_created_by;
    private String trx_updated_by;
    private String trx_deleted_by;

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

    public String getTrx_invoice() {
        return trx_invoice;
    }

    public void setTrx_invoice(String trx_invoice) {
        this.trx_invoice = trx_invoice;
    }

    public Float getTrx_total_price() {
        return trx_total_price;
    }

    public void setTrx_total_price(Float trx_total_price) {
        this.trx_total_price = trx_total_price;
    }

    public Float getTrx_discount_delivery() {
        return trx_discount_delivery;
    }

    public void setTrx_discount_delivery(Float trx_discount_delivery) {
        this.trx_discount_delivery = trx_discount_delivery;
    }

    public Float getTrx_discount_item() {
        return trx_discount_item;
    }

    public void setTrx_discount_item(Float trx_discount_item) {
        this.trx_discount_item = trx_discount_item;
    }

    public Float getTrx_total_discount() {
        return trx_total_discount;
    }

    public void setTrx_total_discount(Float trx_total_discount) {
        this.trx_total_discount = trx_total_discount;
    }

    public Long getTrx_do_id() {
        return trx_do_id;
    }

    public void setTrx_do_id(Long trx_do_id) {
        this.trx_do_id = trx_do_id;
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

    public LocalDateTime getTrx_deleted_at() {
        return trx_deleted_at;
    }

    public void setTrx_deleted_at(LocalDateTime trx_deleted_at) {
        this.trx_deleted_at = trx_deleted_at;
    }

    public String getTrx_created_by() {
        return trx_created_by;
    }

    public void setTrx_created_by(String trx_created_by) {
        this.trx_created_by = trx_created_by;
    }

    public String getTrx_updated_by() {
        return trx_updated_by;
    }

    public void setTrx_updated_by(String trx_updated_by) {
        this.trx_updated_by = trx_updated_by;
    }

    public String getTrx_deleted_by() {
        return trx_deleted_by;
    }

    public void setTrx_deleted_by(String trx_deleted_by) {
        this.trx_deleted_by = trx_deleted_by;
    }
}
