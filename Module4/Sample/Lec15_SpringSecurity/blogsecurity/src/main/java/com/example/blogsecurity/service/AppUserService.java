package com.example.blogsecurity.service;

import com.example.blogsecurity.entity.AppUser;
import org.springframework.stereotype.Service;

@Service
public interface AppUserService {
    AppUser findByUsername(String username);
}
