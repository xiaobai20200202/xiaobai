package com.baizhi.service;

import com.baizhi.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(User user);
    User queryByNameAndPasswors(User user);
    User login(String name,String password);
    /***
     *
     * @param pageNow
     * @param pageSize
     * @param column 模糊查询列
     * @param value  模糊值
     * @return
     */
    List<User> queryUserByPage(Integer pageNow, Integer pageSize,String column,String value);
    int queryUserCount(String column,String value);
    User queryUserById(Integer id);
    void deleteByUserIds(Integer[] ids);
    void updateUser(User user);
    int countTotal(int pageSize,String column,String value);
}
