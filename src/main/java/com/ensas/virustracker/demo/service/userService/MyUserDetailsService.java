package com.ensas.virustracker.demo.service.userService;

import com.ensas.virustracker.demo.dto.UserDto;
import com.ensas.virustracker.demo.entity.User;
import com.ensas.virustracker.demo.repository.VExaminatorRepository.VirusExaminatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    VirusExaminatorRepository examinatorRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        System.out.println("search for user by username " + s);
        User user = examinatorRepository.findByEmail(s);

        System.out.println( user.getNom() + user.getClass());

        UserDto userDto = new UserDto(user);

        System.out.println(userDto);

        return userDto;

    }
}