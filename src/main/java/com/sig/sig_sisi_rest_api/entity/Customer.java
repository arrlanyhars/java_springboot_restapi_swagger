package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cu_id;

    private String cu_fullname;
    private String cu_email;

    // Getters and Setters
    public Long getId() {
        return cu_id;
    }

    public void setId(Long cu_id) {
        this.cu_id = cu_id;
    }

    public String getName() {
        return cu_fullname;
    }

    public void setName(String cu_fullname) {
        this.cu_fullname = cu_fullname;
    }

    public String getEmail() {
        return cu_email;
    }

    public void setEmail(String cu_email) {
        this.cu_email = cu_email;
    }
}
