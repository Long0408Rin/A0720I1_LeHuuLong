package com.example.blogsecurity.service;

import com.example.blogsecurity.entity.AppUser;
import com.example.blogsecurity.entity.UserRole;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public interface UserRoleService {
    Set<UserRole> findByAppUser(AppUser appUser);
}
