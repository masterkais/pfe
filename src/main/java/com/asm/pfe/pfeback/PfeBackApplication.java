package com.asm.pfe.pfeback;

import com.asm.pfe.pfeback.persistance.dao.GroupDao;
import com.asm.pfe.pfeback.persistance.dao.UserDao;
import com.asm.pfe.pfeback.persistance.entities.Group;
import com.asm.pfe.pfeback.persistance.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class PfeBackApplication implements CommandLineRunner {
    @Autowired
    private UserDao userDao;
    @Autowired
    private GroupDao groupDao;

    @Bean
    public BCryptPasswordEncoder getBCPE() {
        return new BCryptPasswordEncoder();
    }
    public static void main(String[] args) {
        SpringApplication.run(PfeBackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       /*Group users = new Group(1L, "USER");
        Group admins = new Group(2L, "ADMIN");
        groupDao.saveAndFlush(users);
        groupDao.saveAndFlush(admins);
        User admin = new User(1L, "admin", "admin", "admin", "admin", "admin", "admin", true, null,
        null,"admin", getBCPE().encode("admin"));
        List<Group> admingroups = new ArrayList<>();
        admingroups.add(admins);
        admingroups.add(users);
        admin.setGroups(admingroups);
        userDao.saveAndFlush(admin);*/

    }
}
