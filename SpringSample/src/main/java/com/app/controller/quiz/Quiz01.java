package com.app.controller.quiz;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz01")
public class Quiz01 {

	@RequestMapping("/main") // 어떤 주소로 접속 했을때
	public String main() { // 이 메소드를 실행 
		
		//return-> view 자원이름
		return "Quiz/main";
	}
	@RequestMapping("/product/mouse") // 어떤 주소로 접속 했을때
	public String product() { // 이 메소드를 실행 
		
		//return-> view 자원이름
		return "Quiz/product/mouse";
	}
	@RequestMapping("/product/keyboard") // 어떤 주소로 접속 했을때
	public String mypage() { // 이 메소드를 실행 
		
		//return-> view 자원이름
		return "Quiz/product/keyboard";
}
}
