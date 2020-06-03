package com.example.demo.mapper;

import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {

    User Sel(@Param("id")Integer id);

    boolean Add(@Param("user")User user);

    boolean Update(@Param("user")User user);

    boolean Delete(@Param("id")Integer id);

    List<User> SelectAll();
}