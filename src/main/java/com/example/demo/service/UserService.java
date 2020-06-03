package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {
    @Autowired
    UserMapper userMapper;

    public User Sel(Integer id) {
        return userMapper.Sel(id);
    }

    public String Add(User user) {
        boolean flag = userMapper.Add(user);
        if (flag) {
            return "添加成功";
        } else {
            return "添加失败";
        }
    }

    public String Update(User user) {
        System.out.println(user);
        boolean flag = userMapper.Update(user);
        System.out.println(user);
        if (flag) {
            return "修改成功";
        } else {
            return "修改失败";
        }
    }

    public String Delete(Integer id) {
        boolean flag = userMapper.Delete(id);

        if (flag) {
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    public List<User> SelectAll() {
        return userMapper.SelectAll();
    }
}