package com.example.blogsecurity.service.impl;

import com.example.blogsecurity.entity.AppUser;
import com.example.blogsecurity.entity.UserRole;
import com.example.blogsecurity.service.AppUserService;
import com.example.blogsecurity.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//@Service
//public class UserDetailsServiceImpl implements  UserRoleService{
//    @Autowired
//    UserRoleService userRoleService;
//
//    @Autowired
//    AppUserService appUserService;
//    @Autowired
//    UserDetailsServiceImpl userDetailsService;
//
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
//        AppUser appUser = appUserService.findByUsername(username);
//
//    if(appUser == null){
//        throw new UsernameNotFoundException("User "+ username + "was not found");
//
//    }
//    @Override
//    public Set<UserRole> findByAppUser(AppUser appUser) {
//        return null;
//    }
//}
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    UserRoleService userRoleService;

    @Autowired
    AppUserService appUserService;

    @Autowired
    UserDetailsServiceImpl userDetailsService;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = appUserService.findByUsername(username);

        if (appUser == null) {
            throw new UsernameNotFoundException("User " + username + " was not found");
        }
        Set<UserRole> userRoles = userRoleService.findByAppUser(appUser);
        List<GrantedAuthority> grantedAuthorities = new ArrayList<>();
        if (userRoles != null) {
            for (UserRole userRole : userRoles) {
                grantedAuthorities.add(new SimpleGrantedAuthority(userRole.getAppRole().getName()));
            }
        }
        return (UserDetails) new User(appUser.getUsername(), appUser.getPassword(), grantedAuthorities);
    }
}
