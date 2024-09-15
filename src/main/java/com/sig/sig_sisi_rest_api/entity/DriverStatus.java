package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "driver_status")
public class DriverStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int drs_id;

    private String drs_description;
    private LocalDateTime drs_created_at;
    private LocalDateTime drs_deleted_at;
    private LocalDateTime drs_updated_at;
    private String drs_created_by;
    private String drs_deleted_by;
    private String drs_updated_by;

    // Getters and Setters

    public int getDrs_id() {
        return drs_id;
    }

    public void setDrs_id(int drs_id) {
        this.drs_id = drs_id;
    }

    public String getDrs_description() {
        return drs_description;
    }

    public void setDrs_description(String drs_description) {
        this.drs_description = drs_description;
    }

    public LocalDateTime getDrs_created_at() {
        return drs_created_at;
    }

    public void setDrs_created_at(LocalDateTime drs_created_at) {
        this.drs_created_at = drs_created_at;
    }

    public LocalDateTime getDrs_deleted_at() {
        return drs_deleted_at;
    }

    public void setDrs_deleted_at(LocalDateTime drs_deleted_at) {
        this.drs_deleted_at = drs_deleted_at;
    }

    public LocalDateTime getDrs_updated_at() {
        return drs_updated_at;
    }

    public void setDrs_updated_at(LocalDateTime drs_updated_at) {
        this.drs_updated_at = drs_updated_at;
    }

    public String getDrs_created_by() {
        return drs_created_by;
    }

    public void setDrs_created_by(String drs_created_by) {
        this.drs_created_by = drs_created_by;
    }

    public String getDrs_deleted_by() {
        return drs_deleted_by;
    }

    public void setDrs_deleted_by(String drs_deleted_by) {
        this.drs_deleted_by = drs_deleted_by;
    }

    public String getDrs_updated_by() {
        return drs_updated_by;
    }

    public void setDrs_updated_by(String drs_updated_by) {
        this.drs_updated_by = drs_updated_by;
    }
}
