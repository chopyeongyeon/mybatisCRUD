package com.example.demo.domain.user.service;

import java.util.List;

import com.example.demo.domain.user.dto.UserDto;
import com.example.demo.domain.user.dto.UserUpdateDto;

public interface UserService {
	List<UserDto> selectAllUser();
	UserDto selectById(String id);
	void insertUser(UserDto userDto);
	void updateUser(String id, UserUpdateDto userUpdateDto);
	void deleteUser(String id);
}
