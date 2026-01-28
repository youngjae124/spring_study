package com.app.controller.quiz.quiz06;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam; // 추가됨

@Controller
@RequestMapping("/quiz06")
public class Quiz06Controller {

	@GetMapping("/ask-bmi")
	public String askBmi() {
		return "quiz/quiz06/ask_bmi";
	}

	@PostMapping("/result-bmi")

	public String resultBmi(@RequestParam("name") String name, @RequestParam("height") double height,
			@RequestParam("weight") double weight, Model model) {

		double heightM = height / 100.0;

		double bmi = weight / (heightM * heightM);

		model.addAttribute("name", name);
		model.addAttribute("height", height);
		model.addAttribute("weight", weight);
		model.addAttribute("bmi", String.format("%.2f", bmi));

		return "quiz/quiz06/result_bmi";
	}
}