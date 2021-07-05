package com.example.blogsecurity.respository;

import com.example.blogsecurity.entity.AppUser;
import com.example.blogsecurity.entity.UserRole;
import com.example.blogsecurity.entity.UserRoleKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, UserRoleKey> {
    Set<UserRole> findByAppUser(AppUser appUser);
}
