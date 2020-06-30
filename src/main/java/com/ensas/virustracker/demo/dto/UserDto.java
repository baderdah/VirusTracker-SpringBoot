package com.ensas.virustracker.demo.dto;

import com.ensas.virustracker.demo.entity.User;
import com.ensas.virustracker.demo.entity.VirusExaminator;
import com.ensas.virustracker.demo.model.auth.Authority;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class UserDto implements UserDetails {

    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String username;
    private String password;

    List<GrantedAuthority> authorities;

    public UserDto(User user){
        authorities = new ArrayList<>();
        System.out.println("begin of constructor");
        username = user.getEmail();
        password = user.getIdentification().getPassword();
        System.out.println("begin of constructor 1");
        if( user.getClass().equals(VirusExaminator.class)){
            authorities.add(new Authority("VExaminator"));
        }
        System.out.println("end of constructor");
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "username='" + username + '\'' +
                ", pasword='" + password + '\'' +
                ", authorities=" + authorities +
                '}';
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
