package com.list.listTest.Service;

import com.list.listTest.JWT.JwtUser;
import com.list.listTest.Respository.UserRepository;
import com.list.listTest.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String s)throws UsernameNotFoundException {
        User user= userRepository.findByUsername((String) s);
        return new JwtUser(user);
    }
}
