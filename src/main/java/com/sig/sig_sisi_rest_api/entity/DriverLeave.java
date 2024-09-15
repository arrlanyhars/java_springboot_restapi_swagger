package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "driver_leave")
public class DriverLeave {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int drl_id;

    private long drl_driver_id;
    private int drl_driver_status_id;
    private LocalDateTime drl_started_at;
    private LocalDateTime drl_ended_at;
    private LocalDateTime drl_created_at;
    private LocalDateTime drl_deleted_at;
    private LocalDateTime drl_updated_at;
    private String drl_created_by;
    private String drl_deleted_by;
    private String drl_updated_by;

    // Getters and Setters

    public int getDrl_id() {
        return drl_id;
    }

    public void setDrl_id(int drl_id) {
        this.drl_id = drl_id;
    }

    public long getDrl_driver_id() {
        return drl_driver_id;
    }

    public void setDrl_driver_id(long drl_driver_id) {
        this.drl_driver_id = drl_driver_id;
    }

    public int getDrl_driver_status_id() {
        return drl_driver_status_id;
    }

    public void setDrl_driver_status_id(int drl_driver_status_id) {
        this.drl_driver_status_id = drl_driver_status_id;
    }

    public LocalDateTime getDrl_started_at() {
        return drl_started_at;
    }

    public void setDrl_started_at(LocalDateTime drl_started_at) {
        this.drl_started_at = drl_started_at;
    }

    public LocalDateTime getDrl_ended_at() {
        return drl_ended_at;
    }

    public void setDrl_ended_at(LocalDateTime drl_ended_at) {
        this.drl_ended_at = drl_ended_at;
    }

    public LocalDateTime getDrl_created_at() {
        return drl_created_at;
    }

    public void setDrl_created_at(LocalDateTime drl_created_at) {
        this.drl_created_at = drl_created_at;
    }

    public LocalDateTime getDrl_deleted_at() {
        return drl_deleted_at;
    }

    public void setDrl_deleted_at(LocalDateTime drl_deleted_at) {
        this.drl_deleted_at = drl_deleted_at;
    }

    public LocalDateTime getDrl_updated_at() {
        return drl_updated_at;
    }

    public void setDrl_updated_at(LocalDateTime drl_updated_at) {
        this.drl_updated_at = drl_updated_at;
    }

    public String getDrl_created_by() {
        return drl_created_by;
    }

    public void setDrl_created_by(String drl_created_by) {
        this.drl_created_by = drl_created_by;
    }

    public String getDrl_deleted_by() {
        return drl_deleted_by;
    }

    public void setDrl_deleted_by(String drl_deleted_by) {
        this.drl_deleted_by = drl_deleted_by;
    }

    public String getDrl_updated_by() {
        return drl_updated_by;
    }

    public void setDrl_updated_by(String drl_updated_by) {
        this.drl_updated_by = drl_updated_by;
    }
}
