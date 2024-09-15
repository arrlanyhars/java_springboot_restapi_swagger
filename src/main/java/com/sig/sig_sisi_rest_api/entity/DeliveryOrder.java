package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "delivery_order")
public class DeliveryOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long do_id;

    private String do_number;
    private Long do_destination_id;
    private Long do_driver_id;
    private LocalDateTime do_created_at;
    private LocalDateTime do_deleted_at;
    private LocalDateTime do_updated_at;
    private String do_created_by;
    private String do_deleted_by;
    private String do_updated_by;

    // Getters and Setters

    public Long getDo_id() {
        return do_id;
    }

    public void setDo_id(Long do_id) {
        this.do_id = do_id;
    }

    public String getDo_number() {
        return do_number;
    }

    public void setDo_number(String do_number) {
        this.do_number = do_number;
    }

    public Long getDo_destination_id() {
        return do_destination_id;
    }

    public void setDo_destination_id(Long do_destination_id) {
        this.do_destination_id = do_destination_id;
    }

    public Long getDo_driver_id() {
        return do_driver_id;
    }

    public void setDo_driver_id(Long do_driver_id) {
        this.do_driver_id = do_driver_id;
    }

    public LocalDateTime getDo_created_at() {
        return do_created_at;
    }

    public void setDo_created_at(LocalDateTime do_created_at) {
        this.do_created_at = do_created_at;
    }

    public LocalDateTime getDo_deleted_at() {
        return do_deleted_at;
    }

    public void setDo_deleted_at(LocalDateTime do_deleted_at) {
        this.do_deleted_at = do_deleted_at;
    }

    public LocalDateTime getDo_updated_at() {
        return do_updated_at;
    }

    public void setDo_updated_at(LocalDateTime do_updated_at) {
        this.do_updated_at = do_updated_at;
    }

    public String getDo_created_by() {
        return do_created_by;
    }

    public void setDo_created_by(String do_created_by) {
        this.do_created_by = do_created_by;
    }

    public String getDo_deleted_by() {
        return do_deleted_by;
    }

    public void setDo_deleted_by(String do_deleted_by) {
        this.do_deleted_by = do_deleted_by;
    }

    public String getDo_updated_by() {
        return do_updated_by;
    }

    public void setDo_updated_by(String do_updated_by) {
        this.do_updated_by = do_updated_by;
    }
}
