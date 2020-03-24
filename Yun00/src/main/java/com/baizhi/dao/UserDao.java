package com.baizhi.dao;

import com.baizhi.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDao {
    void saveUser(User user);
    User login(String name,String password);
    User queryByNameAndPasswors(User user);
    /***
     *
     * @param pageNow
     * @param pageSize
     * @param column 模糊查询列
     * @param value  模糊值
     * @return
     */
    List<User> queryUserByPage(@Param("start") Integer start,@Param("pageSize") Integer pageSize,
                               @Param("column") String column,@Param("value") String value);
    int queryUserCount(@Param("column") String column,@Param("value") String value);
    User queryUserById(Integer id);
    void deleteByUserIds(Integer[] ids);
    void updateUser(User user);
}
