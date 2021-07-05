package com.example.blogsecurity.service;

import com.example.blogsecurity.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<Category> findAll();
    Category findById(int id);
}
