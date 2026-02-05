package com.app.controller.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.dto.user.User;
import com.app.service.user.UserService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// 고객 사용자 관련된 서비스 (계정 관련...)

	@Autowired
	UserService userService;

	@GetMapping("/signup")
	public String signupForm() {
		return "customer/signup"; 
	}
	@PostMapping("/signup")
	public String signupAction(User user) {

		userService.saveCustomerUser(user);

		System.out.println("회원가입 완료: " + user.getId() + " (" + user.getUserType() + ")");

		return "redirect:/main";
	}
}
