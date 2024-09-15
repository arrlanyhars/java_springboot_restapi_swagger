package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_group")
public class UserGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ug_id;

    private String ug_description;
    private LocalDateTime ug_created_at;
    private LocalDateTime ug_deleted_at;
    private LocalDateTime ug_updated_at;
    private String ug_created_by;
    private String ug_deleted_by;
    private String ug_updated_by;

    // Getters and Setters
    public Long getUg_id() {
        return ug_id;
    }

    public void setUg_id(Long ug_id) {
        this.ug_id = ug_id;
    }

    public String getUg_description() {
        return ug_description;
    }

    public void setUg_description(String ug_description) {
        this.ug_description = ug_description;
    }

    public LocalDateTime getUg_created_at() {
        return ug_created_at;
    }

    public void setUg_created_at(LocalDateTime ug_created_at) {
        this.ug_created_at = ug_created_at;
    }

    public LocalDateTime getUg_deleted_at() {
        return ug_deleted_at;
    }

    public void setUg_deleted_at(LocalDateTime ug_deleted_at) {
        this.ug_deleted_at = ug_deleted_at;
    }

    public LocalDateTime getUg_updated_at() {
        return ug_updated_at;
    }

    public void setUg_updated_at(LocalDateTime ug_updated_at) {
        this.ug_updated_at = ug_updated_at;
    }

    public String getUg_created_by() {
        return ug_created_by;
    }

    public void setUg_created_by(String ug_created_by) {
        this.ug_created_by = ug_created_by;
    }

    public String getUg_deleted_by() {
        return ug_deleted_by;
    }

    public void setUg_deleted_by(String ug_deleted_by) {
        this.ug_deleted_by = ug_deleted_by;
    }

    public String getUg_updated_by() {
        return ug_updated_by;
    }

    public void setUg_updated_by(String ug_updated_by) {
        this.ug_updated_by = ug_updated_by;
    }
}
