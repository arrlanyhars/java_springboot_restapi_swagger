package com.sig.sig_sisi_rest_api.repository;

import com.sig.sig_sisi_rest_api.entity.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserGroupRepository extends JpaRepository<UserGroup, Long> {
}
