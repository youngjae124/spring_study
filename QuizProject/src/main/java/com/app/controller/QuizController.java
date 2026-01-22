package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QuizController {

	@RequestMapping("/main") // 어떤 주소로 접속 했을때
	public String main() { // 이 메소드를 실행 
		
		//return-> view 자원이름
		return "main";
	}
	@RequestMapping("/product") // 어떤 주소로 접속 했을때
	public String product() { // 이 메소드를 실행 
		
		//return-> view 자원이름
		return "product";
	}
	@RequestMapping("/mypage") // 어떤 주소로 접속 했을때
	public String mypage() { // 이 메소드를 실행 
		
		//return-> view 자원이름
		return "mypage";
	}
}
