package com.app.controller.study.request;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Request01Controller {

	@RequestMapping("/url1")
	public String url1() {
		return "url1";
	}

	@RequestMapping("/url2")
	public String url2() {
		return "home";
	}

	@RequestMapping("/url3")
	public String url3() {
		return "url3"; // 해당 view 이름을 return -> 없음면 문제~
	}

	@RequestMapping("/url4")
	public String url4() {
		// return "url4";
		return "req/url4";
		// /WEB-INF/views/ .jsp
		// /WEB-INF/views/req/url4.jsp
	}
	// HTTP 통신 Method = GET POST DELETE PU PATCH

	// GET(조회 Read) POST(저장전달 Insert/Write)
	// 	엽서 					편지/소포	
	// 주소+내용 				주소 (내부 : 내용)
	// 크롬 브라우저 주소창 :http://localhost:8080/Request02/url4-> 요청 (GET)

	// GET POST 요청 Method 를 구분해서 요청처리
	@RequestMapping(value = "/url5", method = RequestMethod.GET)
	public String url5() {
		return "req/url4";
	}

	@RequestMapping(value = "/url6", method = RequestMethod.POST)
	public String url6() {
		return "req/url4";
	}

	@GetMapping("/url7")
	public String url7() {
		return "req/url4";
	}

	@PostMapping("/url8")
	public String url8() {
		return "req/url4";
	}
	
	@GetMapping("/req/main")
	public String main() {
		return "req/main";
	}
}
