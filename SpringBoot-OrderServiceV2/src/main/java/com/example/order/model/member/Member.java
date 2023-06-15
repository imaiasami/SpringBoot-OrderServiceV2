package com.example.order.model.member;

import java.time.LocalDate;

import lombok.Data;

@Data
public class Member {
	private String member_id;
	private String password;
	private String name;
	private GenderType gender;
	private LocalDate birth;
	private String email;
	private RoleType role;
	
}
