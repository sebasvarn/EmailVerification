package com.example.emailverification.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

public class AppUser implements UserDetails {

    private Long id;
    private String name;
    private String username;
    private String email;
    private String passsword;
    private AppUserRole appUserRole;

    public AppUser(Long id, String name, String username, String email, String passsword, AppUserRole appUserRole) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.email = email;
        this.passsword = passsword;
        this.appUserRole = appUserRole;
    }


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
