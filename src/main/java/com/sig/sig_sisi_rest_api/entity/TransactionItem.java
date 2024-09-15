package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "transaction_items")
public class TransactionItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long trxi_id;

    private Long trxi_trx_id;
    private Long trxi_varian_id;
    private Long trxi_qty;
    private Float trxi_price;
    private LocalDateTime trxi_created_at;
    private LocalDateTime trxi_deleted_at;
    private LocalDateTime trxi_updated_at;
    private String trxi_created_by;
    private String trxi_deleted_by;
    private String trxi_updated_by;

    // Getters and Setters

    public Long getTrxi_id() {
        return trxi_id;
    }

    public void setTrxi_id(Long trxi_id) {
        this.trxi_id = trxi_id;
    }

    public Long getTrxi_trx_id() {
        return trxi_trx_id;
    }

    public void setTrxi_trx_id(Long trxi_trx_id) {
        this.trxi_trx_id = trxi_trx_id;
    }

    public Long getTrxi_varian_id() {
        return trxi_varian_id;
    }

    public void setTrxi_varian_id(Long trxi_varian_id) {
        this.trxi_varian_id = trxi_varian_id;
    }

    public Long getTrxi_qty() {
        return trxi_qty;
    }

    public void setTrxi_qty(Long trxi_qty) {
        this.trxi_qty = trxi_qty;
    }

    public Float getTrxi_price() {
        return trxi_price;
    }

    public void setTrxi_price(Float trxi_price) {
        this.trxi_price = trxi_price;
    }

    public LocalDateTime getTrxi_created_at() {
        return trxi_created_at;
    }

    public void setTrxi_created_at(LocalDateTime trxi_created_at) {
        this.trxi_created_at = trxi_created_at;
    }

    public LocalDateTime getTrxi_deleted_at() {
        return trxi_deleted_at;
    }

    public void setTrxi_deleted_at(LocalDateTime trxi_deleted_at) {
        this.trxi_deleted_at = trxi_deleted_at;
    }

    public LocalDateTime getTrxi_updated_at() {
        return trxi_updated_at;
    }

    public void setTrxi_updated_at(LocalDateTime trxi_updated_at) {
        this.trxi_updated_at = trxi_updated_at;
    }

    public String getTrxi_created_by() {
        return trxi_created_by;
    }

    public void setTrxi_created_by(String trxi_created_by) {
        this.trxi_created_by = trxi_created_by;
    }

    public String getTrxi_deleted_by() {
        return trxi_deleted_by;
    }

    public void setTrxi_deleted_by(String trxi_deleted_by) {
        this.trxi_deleted_by = trxi_deleted_by;
    }

    public String getTrxi_updated_by() {
        return trxi_updated_by;
    }

    public void setTrxi_updated_by(String trxi_updated_by) {
        this.trxi_updated_by = trxi_updated_by;
    }
}
