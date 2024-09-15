package com.sig.sig_sisi_rest_api.service;

import com.sig.sig_sisi_rest_api.entity.UserGroup;
import com.sig.sig_sisi_rest_api.repository.UserGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserGroupService {

    @Autowired
    private UserGroupRepository userGroupRepository;

    public List<UserGroup> getAllUserGroups() {
        return userGroupRepository.findAll();
    }

    public UserGroup getUserGroupById(Long ug_id) {
        return userGroupRepository.findById(ug_id).orElse(null);
    }

    public UserGroup saveUserGroup(UserGroup userGroup) {
        return userGroupRepository.save(userGroup);
    }

    public void deleteUserGroup(Long ug_id) {
        userGroupRepository.deleteById(ug_id);
    }
}
