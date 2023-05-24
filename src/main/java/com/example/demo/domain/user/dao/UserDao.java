package com.example.demo.domain.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.user.dto.UserDto;

@Mapper
@Repository
public interface UserDao {
	List<UserDto> selectAllUser();
	UserDto selectById(String id);
	void insertUser(UserDto userDto);
	void updateUser(UserDto userDto);
	void deleteUser(String id);
}
