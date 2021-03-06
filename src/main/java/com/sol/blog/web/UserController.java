package com.sol.blog.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sol.blog.domain.user.dto.JoinReqDto;
import com.sol.blog.domain.user.dto.LoginReqDto;
import com.sol.blog.service.UserService;

//http://localhost:8080/blog/user
@WebServlet("/user")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public UserController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	//http://localhost:8080/blog/user?cmd=~~
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String cmd = request.getParameter("cmd");
		UserService userservice = new UserService();
		
		if(cmd.equals("loginForm")) {
			response.sendRedirect("user/loginForm.jsp");
		} else if(cmd.equals("login")) {
			//서비스 호출
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			LoginReqDto dto = new LoginReqDto();
			dto.setUsername(username);
			dto.setPassword(password);
			
			userservice.로그인(dto);
		} else if(cmd.equals("joinForm")) {
			response.sendRedirect("user/joinForm.jsp"); 
		} else if(cmd.equals("join")) {
			//서비스 호출
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String address = request.getParameter("address");
			
			JoinReqDto dto = new JoinReqDto();
			dto.setUsername(username);
			dto.setPassword(password);
			dto.setEmail(email);
			dto.setAddress(address);
			
			userservice.회원가입(dto);
		}
	}
}
