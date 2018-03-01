package edu.nuc.dao;

import edu.nuc.model.User;

import java.util.List;

/**
 * Created by 超 on 2017/10/19.
 */
public interface UserDao {
    public User getUserById(String id);

    public List<User> getAllUser();
}
