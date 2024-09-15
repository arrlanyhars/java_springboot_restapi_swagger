package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "varian")
public class Varian {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long v_id;

    private String v_name;
    private Float v_price;
    private Long v_stock;
    private LocalDateTime v_created_at;
    private LocalDateTime v_deleted_at;
    private LocalDateTime v_updated_at;
    private String v_created_by;
    private String v_deleted_by;
    private String v_updated_by;

    // Getters and Setters

    public Long getV_id() {
        return v_id;
    }

    public void setV_id(Long v_id) {
        this.v_id = v_id;
    }

    public String getV_name() {
        return v_name;
    }

    public void setV_name(String v_name) {
        this.v_name = v_name;
    }

    public Float getV_price() {
        return v_price;
    }

    public void setV_price(Float v_price) {
        this.v_price = v_price;
    }

    public Long getV_stock() {
        return v_stock;
    }

    public void setV_stock(Long v_stock) {
        this.v_stock = v_stock;
    }

    public LocalDateTime getV_created_at() {
        return v_created_at;
    }

    public void setV_created_at(LocalDateTime v_created_at) {
        this.v_created_at = v_created_at;
    }

    public LocalDateTime getV_deleted_at() {
        return v_deleted_at;
    }

    public void setV_deleted_at(LocalDateTime v_deleted_at) {
        this.v_deleted_at = v_deleted_at;
    }

    public LocalDateTime getV_updated_at() {
        return v_updated_at;
    }

    public void setV_updated_at(LocalDateTime v_updated_at) {
        this.v_updated_at = v_updated_at;
    }

    public String getV_created_by() {
        return v_created_by;
    }

    public void setV_created_by(String v_created_by) {
        this.v_created_by = v_created_by;
    }

    public String getV_deleted_by() {
        return v_deleted_by;
    }

    public void setV_deleted_by(String v_deleted_by) {
        this.v_deleted_by = v_deleted_by;
    }

    public String getV_updated_by() {
        return v_updated_by;
    }

    public void setV_updated_by(String v_updated_by) {
        this.v_updated_by = v_updated_by;
    }
}
