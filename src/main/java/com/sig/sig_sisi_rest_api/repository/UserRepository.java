package com.sig.sig_sisi_rest_api.repository;

import com.sig.sig_sisi_rest_api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByuEmail(String uEmail);
}
