package com.example.demo.domain.user.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class Users {
	private String id;
	private String pw;
	private String name;
	
	public Users(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}
