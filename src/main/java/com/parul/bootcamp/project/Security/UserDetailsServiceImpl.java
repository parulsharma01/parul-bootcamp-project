package com.parul.bootcamp.project.Security;

import com.parul.bootcamp.project.entities.User;
import com.parul.bootcamp.project.repos.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    ModelMapper modelMapper;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = modelMapper.map(userRepository.findByEmail(username), User.class);
        if(user ==null){
            throw new UsernameNotFoundException("User Not Found for Email" + username);
        }
        return (UserDetails) user;
    }

}



