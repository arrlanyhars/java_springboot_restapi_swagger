package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ci_id;

    private String ci_description;
    private LocalDateTime ci_created_at;
    private LocalDateTime ci_deleted_at;
    private LocalDateTime ci_updated_at;
    private String ci_created_by;
    private String ci_deleted_by;
    private String ci_updated_by;

    // Getters and Setters

    public Long getCi_id() {
        return ci_id;
    }

    public void setCi_id(Long ci_id) {
        this.ci_id = ci_id;
    }

    public String getCi_description() {
        return ci_description;
    }

    public void setCi_description(String ci_description) {
        this.ci_description = ci_description;
    }

    public LocalDateTime getCi_created_at() {
        return ci_created_at;
    }

    public void setCi_created_at(LocalDateTime ci_created_at) {
        this.ci_created_at = ci_created_at;
    }

    public LocalDateTime getCi_deleted_at() {
        return ci_deleted_at;
    }

    public void setCi_deleted_at(LocalDateTime ci_deleted_at) {
        this.ci_deleted_at = ci_deleted_at;
    }

    public LocalDateTime getCi_updated_at() {
        return ci_updated_at;
    }

    public void setCi_updated_at(LocalDateTime ci_updated_at) {
        this.ci_updated_at = ci_updated_at;
    }

    public String getCi_created_by() {
        return ci_created_by;
    }

    public void setCi_created_by(String ci_created_by) {
        this.ci_created_by = ci_created_by;
    }

    public String getCi_deleted_by() {
        return ci_deleted_by;
    }

    public void setCi_deleted_by(String ci_deleted_by) {
        this.ci_deleted_by = ci_deleted_by;
    }

    public String getCi_updated_by() {
        return ci_updated_by;
    }

    public void setCi_updated_by(String ci_updated_by) {
        this.ci_updated_by = ci_updated_by;
    }
}
