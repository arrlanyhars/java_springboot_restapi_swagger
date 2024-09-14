package com.sig.sig_sisi_rest_api.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long c_id;

    private String c_fullname;
    private String c_email;
    private Short c_status;
    private Long c_accepted_by_id;
    private LocalDateTime c_created_at;
    private LocalDateTime c_deleted_at;
    private LocalDateTime c_updated_at;
    private String c_created_by;
    private String c_deleted_by;
    private String c_updated_by;

    // Getters and Setters
    public Long getId() {
        return c_id;
    }

    public void setId(Long c_id) {
        this.c_id = c_id;
    }

    public String getName() {
        return c_fullname;
    }

    public void setName(String c_fullname) {
        this.c_fullname = c_fullname;
    }

    public String getEmail() {
        return c_email;
    }

    public void setEmail(String c_email) {
        this.c_email = c_email;
    }

    public Short getStatus() {
        return c_status;
    }

    public void setStatus(Short c_status) {
        this.c_status = c_status;
    }

    public Long getAcceptedById() {
        return c_accepted_by_id;
    }

    public void setAcceptedById(Long c_accepted_by_id) {
        this.c_accepted_by_id = c_accepted_by_id;
    }

    public LocalDateTime getCreatedAt() {
        return c_created_at;
    }

    public void setCreatedAt(LocalDateTime c_created_at) {
        this.c_created_at = c_created_at;
    }

    public LocalDateTime getDeletedAt() {
        return c_deleted_at;
    }

    public void setDeletedAt(LocalDateTime c_deleted_at) {
        this.c_deleted_at = c_deleted_at;
    }

    public LocalDateTime getUpdatedAt() {
        return c_updated_at;
    }

    public void setUpdatedAt(LocalDateTime c_updated_at) {
        this.c_updated_at = c_updated_at;
    }

    public String getCreatedBy() {
        return c_created_by;
    }

    public void setCreatedBy(String c_created_by) {
        this.c_created_by = c_created_by;
    }

    public String getDeletedBy() {
        return c_deleted_by;
    }

    public void setDeletedBy(String c_deleted_by) {
        this.c_deleted_by = c_deleted_by;
    }

    public String getUpdatedBy() {
        return c_updated_by;
    }

    public void setUpdatedBy(String c_updated_by) {
        this.c_updated_by = c_updated_by;
    }
}
