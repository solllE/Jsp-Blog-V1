package com.sol.blog.service;

import com.sol.blog.domain.user.User;
import com.sol.blog.domain.user.dto.JoinReqDto;
import com.sol.blog.domain.user.dto.LoginReqDto;
import com.sol.blog.domain.user.dto.UpdateReqDto;

public class UserService {
	// 회원가입, 회원수정, 로그인, 로그아웃, 아이디 중복체크
	
	public int 회원가입(JoinReqDto dto) {
		
		return -1;
	}
	
	public User 로그인(LoginReqDto dto) {
		
		return null;
	}
	
	public int 회원수정(UpdateReqDto dto) {
		
		return -1;
	}
	
//	public void 로그아웃() {
//		데이터베이스 접근과 관련한 일이 없기때문에 서비스가 아닌 컨트롤러에서 세션을 날려서 처리한다.
//	}
	
	public int 아이디중복체크(String username) {
		
		return -1;
	}
}
