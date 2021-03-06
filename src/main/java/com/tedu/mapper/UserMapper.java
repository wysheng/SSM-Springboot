package com.tedu.mapper;

import com.tedu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

/**
 * Created by LYJ on 2017/3/19.
 */
public interface UserMapper {
    //查询全部用户信息
    public List<User> findAll();

	public void addUser(User user);

	public User findUserById(Integer id);

	public void updateUser(User user);

	public void deleteUser(Integer id);
}
