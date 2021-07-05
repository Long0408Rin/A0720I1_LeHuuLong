package com.example.blogsecurity.service.impl;

import com.example.blogsecurity.entity.AppUser;
import com.example.blogsecurity.respository.AppRoleRepository;
import com.example.blogsecurity.respository.AppUserRepository;
import com.example.blogsecurity.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {
    @Autowired
    AppUserRepository appUserRepository;

    @Override
    public AppUser findByUsername(String username){
        return appUserRepository.findById(username).orElse(null);
    }

}
