package com.example.demo.domain.user.service;

import java.util.List;

import com.example.demo.domain.user.dto.UserUpdateDto;
import org.springframework.stereotype.Service;

import com.example.demo.domain.user.dao.UserDao;
import com.example.demo.domain.user.dto.UserDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	private final UserDao userDao;

	@Override
	public List<UserDto> selectAllUser() {
		return userDao.selectAllUser();
	}
	
	@Override
	public UserDto selectById(String id) {
		return userDao.selectById(id);
	}

	@Override
	public void insertUser(UserDto userDto) {
		userDao.insertUser(userDto);
	}

	@Override
	public void updateUser(String id, UserUpdateDto userUpdateDto) {
		UserDto userinfo = userDao.selectById(id);
		
		if(userinfo != null) {
			userinfo.setPw(userUpdateDto.getPw());
			userinfo.setName(userUpdateDto.getName());
		} else {
			throw new IllegalStateException("존재하지 않는 유저입니다");
		}
		
		userDao.updateUser(userinfo);
	}

	@Override
	public void deleteUser(String id) {
		if(userDao.selectById(id) != null) {
			userDao.deleteUser(id);
		} else {
			throw new IllegalStateException("존재하지 않는 유저입니다");
		}
	}
}
