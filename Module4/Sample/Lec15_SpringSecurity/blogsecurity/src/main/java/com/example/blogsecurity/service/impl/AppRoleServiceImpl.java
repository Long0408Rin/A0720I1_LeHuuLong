package com.example.blogsecurity.service.impl;

import com.example.blogsecurity.entity.AppRole;
import com.example.blogsecurity.respository.AppRoleRepository;
import com.example.blogsecurity.service.AppRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppRoleServiceImpl implements AppRoleService {
    @Autowired
    AppRoleRepository appRoleRepository;
    @Override
    public AppRole findById(int id){
        return appRoleRepository.findById(id).orElse(null);
    }
}
