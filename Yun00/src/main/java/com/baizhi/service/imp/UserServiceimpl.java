package com.baizhi.service.imp;

import com.baizhi.dao.UserDao;
import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {


    @Autowired
    private UserDao userDao;

    @Override
    public void saveUser(User user) {
            userDao.saveUser(user);
    }

    @Override
    public int countTotal(int pageSize,String column,String value) {
        int count = userDao.queryUserCount(column,value);

        return (count%pageSize==0)?(count/pageSize):(count/pageSize)+1;
    }

    @Override
    public User login(String name, String password) {
        User user = userDao.login(name, password);
        return user;
    }

    @Override
    public User queryByNameAndPasswors(User user) {
        User user1 = userDao.queryByNameAndPasswors(user);
        return user1;
    }

    @Override
    public List<User> queryUserByPage(Integer pageNow, Integer pageSize,String column,String value) {
        int start=(pageNow-1)*pageSize;
        System.out.println(pageNow+" "+pageSize+" "+column+value);
        List<User> users = userDao.queryUserByPage(start, pageSize,column,value);

        return users;
    }

    @Override
    public int queryUserCount(String column,String value) {
        int i = userDao.queryUserCount(column,value);
        return i;
    }

    @Override
    public User queryUserById(Integer id) {
        User user = userDao.queryUserById(id);
        return user;
    }

    @Override
    public void deleteByUserIds(Integer[] ids) {
        userDao.deleteByUserIds(ids);

    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user);
    }
}
