package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "customer_address")
public class CustomerAddress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ca_id;

    private Long ca_customer_id;
    private String ca_jalan;
    private String ca_kelurahan;
    private String ca_kecamatan;
    private Integer ca_kab_kota_id;
    private String ca_postal_code;
    private LocalDateTime ca_created_at;
    private LocalDateTime ca_deleted_at;
    private LocalDateTime ca_updated_at;
    private String ca_created_by;
    private String ca_deleted_by;
    private String ca_updated_by;

    // Getters and Setters
    public Long getCa_id() {
        return ca_id;
    }

    public void setCa_id(Long ca_id) {
        this.ca_id = ca_id;
    }

    public Long getCa_customer_id() {
        return ca_customer_id;
    }

    public void setCa_customer_id(Long ca_customer_id) {
        this.ca_customer_id = ca_customer_id;
    }

    public String getCa_jalan() {
        return ca_jalan;
    }

    public void setCa_jalan(String ca_jalan) {
        this.ca_jalan = ca_jalan;
    }

    public String getCa_kelurahan() {
        return ca_kelurahan;
    }

    public void setCa_kelurahan(String ca_kelurahan) {
        this.ca_kelurahan = ca_kelurahan;
    }

    public String getCa_kecamatan() {
        return ca_kecamatan;
    }

    public void setCa_kecamatan(String ca_kecamatan) {
        this.ca_kecamatan = ca_kecamatan;
    }

    public Integer getCa_kab_kota_id() {
        return ca_kab_kota_id;
    }

    public void setCa_kab_kota_id(Integer ca_kab_kota_id) {
        this.ca_kab_kota_id = ca_kab_kota_id;
    }

    public String getCa_postal_code() {
        return ca_postal_code;
    }

    public void setCa_postal_code(String ca_postal_code) {
        this.ca_postal_code = ca_postal_code;
    }

    public LocalDateTime getCa_created_at() {
        return ca_created_at;
    }

    public void setCa_created_at(LocalDateTime ca_created_at) {
        this.ca_created_at = ca_created_at;
    }

    public LocalDateTime getCa_deleted_at() {
        return ca_deleted_at;
    }

    public void setCa_deleted_at(LocalDateTime ca_deleted_at) {
        this.ca_deleted_at = ca_deleted_at;
    }

    public LocalDateTime getCa_updated_at() {
        return ca_updated_at;
    }

    public void setCa_updated_at(LocalDateTime ca_updated_at) {
        this.ca_updated_at = ca_updated_at;
    }

    public String getCa_created_by() {
        return ca_created_by;
    }

    public void setCa_created_by(String ca_created_by) {
        this.ca_created_by = ca_created_by;
    }

    public String getCa_deleted_by() {
        return ca_deleted_by;
    }

    public void setCa_deleted_by(String ca_deleted_by) {
        this.ca_deleted_by = ca_deleted_by;
    }

    public String getCa_updated_by() {
        return ca_updated_by;
    }

    public void setCa_updated_by(String ca_updated_by) {
        this.ca_updated_by = ca_updated_by;
    }
}
