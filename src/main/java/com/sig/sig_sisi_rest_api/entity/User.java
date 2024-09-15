package com.sig.sig_sisi_rest_api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long u_id;

    @Column(name = "u_full_name")
    private String uFullName;

    @Column(name = "u_email", unique = true)
    private String uEmail;

    @Column(name = "u_password")
    private String uPassword;

    @Column(name = "u_status")
    private Integer uStatus;

    @Column(name = "u_group_id")
    private Integer uGroupId;

    @Column(name = "u_created_at")
    private LocalDateTime uCreatedAt;

    @Column(name = "u_updated_at")
    private LocalDateTime uUpdatedAt;

    @Column(name = "u_deleted_at")
    private LocalDateTime uDeletedAt;

    // Getters and Setters

    public Long getU_id() {
        return u_id;
    }

    public void setU_id(Long u_id) {
        this.u_id = u_id;
    }

    public String getUFullName() {
        return uFullName;
    }

    public void setUFullName(String uFullName) {
        this.uFullName = uFullName;
    }

    public String getUEmail() {
        return uEmail;
    }

    public void setUEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getUPassword() {
        return uPassword;
    }

    public void setUPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Integer getUStatus() {
        return uStatus;
    }

    public void setUStatus(Integer uStatus) {
        this.uStatus = uStatus;
    }

    public Integer getUGroupId() {
        return uGroupId;
    }

    public void setUGroupId(Integer uGroupId) {
        this.uGroupId = uGroupId;
    }

    public LocalDateTime getUCreatedAt() {
        return uCreatedAt;
    }

    public void setUCreatedAt(LocalDateTime uCreatedAt) {
        this.uCreatedAt = uCreatedAt;
    }

    public LocalDateTime getUUpdatedAt() {
        return uUpdatedAt;
    }

    public void setUUpdatedAt(LocalDateTime uUpdatedAt) {
        this.uUpdatedAt = uUpdatedAt;
    }

    public LocalDateTime getUDeletedAt() {
        return uDeletedAt;
    }

    public void setUDeletedAt(LocalDateTime uDeletedAt) {
        this.uDeletedAt = uDeletedAt;
    }
}
