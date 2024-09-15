package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "driver")
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long dr_id;

    private String dr_full_name;
    private int dr_status_id;
    private LocalDateTime dr_created_at;
    private LocalDateTime dr_deleted_at;
    private LocalDateTime dr_updated_at;
    private String dr_created_by;
    private String dr_deleted_by;
    private String dr_updated_by;

    // Getters and Setters

    public Long getDr_id() {
        return dr_id;
    }

    public void setDr_id(Long dr_id) {
        this.dr_id = dr_id;
    }

    public String getDr_full_name() {
        return dr_full_name;
    }

    public void setDr_full_name(String dr_full_name) {
        this.dr_full_name = dr_full_name;
    }

    public int getDr_status_id() {
        return dr_status_id;
    }

    public void setDr_status_id(int dr_status_id) {
        this.dr_status_id = dr_status_id;
    }

    public LocalDateTime getDr_created_at() {
        return dr_created_at;
    }

    public void setDr_created_at(LocalDateTime dr_created_at) {
        this.dr_created_at = dr_created_at;
    }

    public LocalDateTime getDr_deleted_at() {
        return dr_deleted_at;
    }

    public void setDr_deleted_at(LocalDateTime dr_deleted_at) {
        this.dr_deleted_at = dr_deleted_at;
    }

    public LocalDateTime getDr_updated_at() {
        return dr_updated_at;
    }

    public void setDr_updated_at(LocalDateTime dr_updated_at) {
        this.dr_updated_at = dr_updated_at;
    }

    public String getDr_created_by() {
        return dr_created_by;
    }

    public void setDr_created_by(String dr_created_by) {
        this.dr_created_by = dr_created_by;
    }

    public String getDr_deleted_by() {
        return dr_deleted_by;
    }

    public void setDr_deleted_by(String dr_deleted_by) {
        this.dr_deleted_by = dr_deleted_by;
    }

    public String getDr_updated_by() {
        return dr_updated_by;
    }

    public void setDr_updated_by(String dr_updated_by) {
        this.dr_updated_by = dr_updated_by;
    }
}
