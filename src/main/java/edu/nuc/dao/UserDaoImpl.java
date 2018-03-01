package edu.nuc.dao;

import edu.nuc.model.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * Created by 超 on 2017/10/19.
 */
public class UserDaoImpl implements UserDao {

    private SqlSessionTemplate sqlSessionTemplate;

    public SqlSessionTemplate getSqlSessionTemplate() {
        return sqlSessionTemplate;
    }

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    public User  getUserById(String id){
        User user = sqlSessionTemplate.selectOne("edu.nuc.mapper.UserMapper.getUserById",id);
        return user;
    }

    public List<User> getAllUser() {
        List<User> users = sqlSessionTemplate.selectList("edu.nuc.mapper.UserMapper.getAllUser");
        return users;
    }
}
