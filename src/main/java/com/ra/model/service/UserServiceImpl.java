package com.ra.model.service;

import com.ra.model.dao.UserDAO;
import com.ra.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;
    @Override
    public List<User> getAll() {
        return userDAO.getAll();
    }
}
