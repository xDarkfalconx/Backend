package com.youtube.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.youtube.demo.dao.UserRepository;

@Service
public class UserServiceImpl implements UserService {
@Autowired
	protected UserRepository userRepository;
	
}
