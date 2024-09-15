package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer_purchase")
public class CustomerPurchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cpur_id;

    private Long cpur_customer_id;
    private LocalDateTime cpur_date;
    private Float cpur_total_purchase;
    private LocalDateTime cpur_created_at;
    private LocalDateTime cpur_deleted_at;
    private LocalDateTime cpur_updated_at;
    private String cpur_created_by;
    private String cpur_deleted_by;
    private String cpur_updated_by;

    // Getters and Setters

    public Long getCpur_id() {
        return cpur_id;
    }

    public void setCpur_id(Long cpur_id) {
        this.cpur_id = cpur_id;
    }

    public Long getCpur_customer_id() {
        return cpur_customer_id;
    }

    public void setCpur_customer_id(Long cpur_customer_id) {
        this.cpur_customer_id = cpur_customer_id;
    }

    public LocalDateTime getCpur_date() {
        return cpur_date;
    }

    public void setCpur_date(LocalDateTime cpur_date) {
        this.cpur_date = cpur_date;
    }

    public Float getCpur_total_purchase() {
        return cpur_total_purchase;
    }

    public void setCpur_total_purchase(Float cpur_total_purchase) {
        this.cpur_total_purchase = cpur_total_purchase;
    }

    public LocalDateTime getCpur_created_at() {
        return cpur_created_at;
    }

    public void setCpur_created_at(LocalDateTime cpur_created_at) {
        this.cpur_created_at = cpur_created_at;
    }

    public LocalDateTime getCpur_deleted_at() {
        return cpur_deleted_at;
    }

    public void setCpur_deleted_at(LocalDateTime cpur_deleted_at) {
        this.cpur_deleted_at = cpur_deleted_at;
    }

    public LocalDateTime getCpur_updated_at() {
        return cpur_updated_at;
    }

    public void setCpur_updated_at(LocalDateTime cpur_updated_at) {
        this.cpur_updated_at = cpur_updated_at;
    }

    public String getCpur_created_by() {
        return cpur_created_by;
    }

    public void setCpur_created_by(String cpur_created_by) {
        this.cpur_created_by = cpur_created_by;
    }

    public String getCpur_deleted_by() {
        return cpur_deleted_by;
    }

    public void setCpur_deleted_by(String cpur_deleted_by) {
        this.cpur_deleted_by = cpur_deleted_by;
    }

    public String getCpur_updated_by() {
        return cpur_updated_by;
    }

    public void setCpur_updated_by(String cpur_updated_by) {
        this.cpur_updated_by = cpur_updated_by;
    }
}
