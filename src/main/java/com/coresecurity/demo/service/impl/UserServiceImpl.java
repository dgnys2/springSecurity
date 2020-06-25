package com.coresecurity.demo.service.impl;

import com.coresecurity.demo.domain.Account;
import com.coresecurity.demo.repository.UserRepository;
import com.coresecurity.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
public class UserServiceImpl implements UserService {


    @Autowired
    private UserRepository userRepository;

    @Transactional
    @Override
    public void createUser(Account account) {

        userRepository.save(account);
    }
}
