package com.example.blogsecurity.service.impl;

import com.example.blogsecurity.entity.AppUser;
import com.example.blogsecurity.entity.UserRole;
import com.example.blogsecurity.respository.UserRoleRepository;
import com.example.blogsecurity.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserRoleServiceImpl implements UserRoleService {
    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public Set<UserRole> findByAppUser(AppUser appUser) {
        return userRoleRepository.findByAppUser(appUser);
    }
}
