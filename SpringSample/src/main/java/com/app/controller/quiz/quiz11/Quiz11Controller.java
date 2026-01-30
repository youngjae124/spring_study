package com.app.controller.quiz.quiz11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/quiz11")
public class Quiz11Controller {

//	@GetMapping("/first")
//	public String first(HttpServletRequest request, HttpSession session) {
//		session.getAttribute("accessUrl");
//		session.removeAttribute("accessUrl");
//
//		request.setAttribute("accessUrl", "/first");
//		return "quiz/quiz11/targetPage";
//	}
//
//	@GetMapping("/firsthide1")
//	public String firsthide1(HttpServletRequest request) {
//		request.setAttribute("accessUrl", "/firsthide1");
//		return "quiz/quiz11/targetPage";
//	}
//
//	@GetMapping("/firsthide2")
//	public String firsthide2(HttpSession session) {
//		session.setAttribute("accessUrl", "/first");
//		return "redirect:/quiz11/first";
//	}
//
//	@GetMapping("/clear")
//	public String clear(HttpSession session) {
//		session.invalidate();
//		return "redirect:/quiz11/first";
//	}
	
	//  ------------------------선생님 풀이-------------------------
	@GetMapping("/quiz11/first")
	public String first(Model model) {
		
		model.addAttribute("accessUrl", "/first");
		
		return "quiz/quiz11/targetPage";
	}
	
	@GetMapping("/quiz11/firsthide1")
	public String firsthide1(Model model) {
		
		model.addAttribute("accessUrl", "/firsthide1");
		
		return "quiz/quiz11/targetPage";
	}
	
	@GetMapping("/quiz11/firsthide2")
	public String firsthide2(Model model) {
		
		// firsthide2 요청 request 
		//model.addAttribute("accessUrl", "/first");
		//필요없음.
		
		//first 경로로 새로운 요청 request
		//return "quiz/quiz11/targetPage";
		return "redirect:/quiz11/first";
	}
}
