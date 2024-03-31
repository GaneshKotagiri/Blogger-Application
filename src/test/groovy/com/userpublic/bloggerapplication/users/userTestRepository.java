package com.userpublic.bloggerapplication.users;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestConstructor;

import java.util.List;

import static com.userpublic.bloggerapplication.users.UsersEntity.*;

@DataJpaTest
@ActiveProfiles("test")
public class userTestRepository {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Order(1)
    void can_create_user(){
        UsersEntity.UsersEntityBuilder user=UsersEntity.builder();
        user.UserName("Ganesh");
        user.Email("ganesh@blog.com");
        UsersEntity build = user.build();
        userRepository.save(build);
    }
    @Test
    @Order(2)
    void can_find_user(){
        UsersEntity.UsersEntityBuilder user=UsersEntity.builder();
        user.UserName("Ganesh");
        user.Email("ganesh@blog.com");
        UsersEntity build = user.build();
        userRepository.save(build);
        List<UsersEntity> users=userRepository.findAll();
        Assertions.assertEquals(1,users.size());
    }
}
