package com.parul.bootcamp.project;

import com.parul.bootcamp.project.Enum.RoleEnum;
import com.parul.bootcamp.project.entities.Role;
import com.parul.bootcamp.project.entities.User;
import com.parul.bootcamp.project.repos.RoleRepository;
import com.parul.bootcamp.project.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class Bootstrap implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if(Objects.isNull(roleRepository.findByAuthority(RoleEnum.ROLE_ADMIN))) {
            Role role = new Role();
            role.setAuthority(RoleEnum.ROLE_ADMIN);
            Role role1 = new Role();
            role1.setAuthority(RoleEnum.ROLE_CUSTOMER);
            Role role2 = new Role();
            role2.setAuthority(RoleEnum.ROLE_SELLER);

            roleRepository.save(role);
            roleRepository.save(role1);
            roleRepository.save(role2);

            User user = new User();
            user.setEmail("admin@ttn.com");
            user.setFirstName("Parul");
            user.setMiddleName("");
            user.setLastName("Sharma");
            user.setPassword("Password@123");
            user.setPassword(passwordEncoder.encode("admin"));
            user.setRoles(roleRepository.findById(1));
            user.setActive(true);
            user.setDeleted(false);
            user.setExpired(false);
            user.setLocked(false);
            userRepository.save(user);

        }
    }
}
