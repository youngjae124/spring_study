package com.app.controller.quiz.quiz03;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/quiz03")
public class Quiz03Controller {
	@GetMapping("/request1-1")
	public String request1_1(HttpServletRequest request) {
		
		System.out.println("/request1-1 요청");		
		String item = request.getParameter("item");
		String type = request.getParameter("type");
		
		System.out.println("item: " + item);
		System.out.println("type: "+ type);
		
		
		request.setAttribute("item", item); //key value
		request.setAttribute("type", type);
		return "quiz/quiz03/request1-1";
	}
	@GetMapping("/request1-2")
	public String request1_2(@RequestParam String item, @RequestParam String type) {
		System.out.println("/quiz03/request1-2");
		System.out.println(item);
		System.err.println(type);
		
		return "quiz/quiz03/request1-1";
	}
	
	@GetMapping("/request1-3")
	public String request1_3(@RequestParam Map<String, String> paramMap) {
		System.out.println("/quiz03/request1-3");
		System.out.println(paramMap.get("item"));
		System.err.println(paramMap.get("type"));
		
		return "quiz/quiz03/request1-1";
	}
	
	@GetMapping("/request1-4")
	public String request1_4(@ModelAttribute Beverage beverage) {
		System.out.println("/quiz03/request1-4");
		System.out.println(beverage);
		System.err.println(beverage.getItem());
		System.err.println(beverage.getType());
		
		return "quiz/quiz03/request1-1";
	}
	
	@GetMapping("/viewData1-1")
	public String viewData1_1(HttpServletRequest request) {
		System.out.println("/quiz03/viewData1-1");
		request.setAttribute("name", "싸이버거");
		request.setAttribute("type", "햄버거");
		
		return "quiz/quiz03/viewData";
	}
	
	@GetMapping("/viewData1-2")
	public String viewData1_2(Model model) {
		System.out.println("/quiz03/viewData1-1");
		model.addAttribute("name", "순대국밥");
		model.addAttribute("type", "한식");
		
		return "quiz/quiz03/viewData";
	}
	@GetMapping("/viewData1-3")
	public ModelAndView viewData1_3() {
		ModelAndView mav = new ModelAndView();
		System.out.println("/quiz03/viewData");
		mav.setViewName("quiz/quiz03/viewData");
		mav.addObject("name", "김밥");
		mav.addObject("type", "분식");
		
		return mav;
		
	}
	
	@GetMapping("/viewData1-4")
	public String viewData1_4(Model model) {
		System.out.println("/quiz03/viewData1-4");
		
		//기본타입 전달
		//model.addAttribute("name", "순대국밥");
		//model.addAttribute("type", "한식");
		
		//객체 전달
		DrinkItem drinkItem = new DrinkItem();
		drinkItem.setName("제로콜라");
		drinkItem.setType("탄산음료");
		
		model.addAttribute("drinkItem", drinkItem);
		
		return "quiz/quiz03/viewData";
	}
	
	
	
	
	//http://localhost:8080/quiz03/viewData1-5?item=americano22&type=coffee22
	@GetMapping("/viewData1-5")
	public String viewData1_5(@ModelAttribute Beverage beverage, Model model) {
		System.out.println("/quiz03/viewData1-5");
		
		//기본타입 전달
		//model.addAttribute("name", "순대국밥");
		//model.addAttribute("type", "한식");
		
		//파라미터 요청 객체 받기
		System.out.println(beverage);
		System.out.println(beverage.getItem());
		System.out.println(beverage.getType());
		
		
		//객체 전달
		DrinkItem drinkItem = new DrinkItem();
		drinkItem.setName("제로콜라");
		drinkItem.setType("탄산음료");
		
		model.addAttribute("drinkItem", drinkItem);
		
		return "quiz/quiz03/viewData";
	}
	
}
