package com.sig.sig_sisi_rest_api.controller;

import com.sig.sig_sisi_rest_api.entity.UserGroup;
import com.sig.sig_sisi_rest_api.service.UserGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-groups")
public class UserGroupController {

    @Autowired
    private UserGroupService userGroupService;

    @GetMapping
    public List<UserGroup> getAllUserGroups() {
        return userGroupService.getAllUserGroups();
    }

    @GetMapping("/{ug_id}")
    public UserGroup getUserGroupById(@PathVariable Long ug_id) {
        return userGroupService.getUserGroupById(ug_id);
    }

    @PostMapping
    public UserGroup createUserGroup(@RequestBody UserGroup userGroup) {
        return userGroupService.saveUserGroup(userGroup);
    }

    @PutMapping("/{ug_id}")
    public UserGroup updateUserGroup(@PathVariable Long ug_id, @RequestBody UserGroup userGroupDetails) {
        UserGroup userGroup = userGroupService.getUserGroupById(ug_id);
        if (userGroup != null) {
            userGroup.setUg_description(userGroupDetails.getUg_description());
            userGroup.setUg_updated_at(userGroupDetails.getUg_updated_at());
            userGroup.setUg_updated_by(userGroupDetails.getUg_updated_by());
            return userGroupService.saveUserGroup(userGroup);
        }
        return null;
    }

    @DeleteMapping("/{ug_id}")
    public void deleteUserGroup(@PathVariable Long ug_id) {
        userGroupService.deleteUserGroup(ug_id);
    }
}
