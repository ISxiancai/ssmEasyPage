package edu.nuc.service;

import edu.nuc.dao.UserDao;
import edu.nuc.model.User;

import java.util.List;

/**
 * Created by 超 on 2017/10/19.
 */
public class UserServiceImpl implements UserService{
    UserDao userDao = null;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserById (String id){
        return userDao.getUserById(id);
    }

    public List<User> getAllUser() {
        List<User> users = userDao.getAllUser();
        return users;
    }
}
