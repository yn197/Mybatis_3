package com.cs.mapper;

import com.cs.entry.User;

import java.util.List;

public interface UserMapper {

    public List<User> findAll();

    public List<User> findUserAndRoleAll();

}
