package com.zorro.template.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestController {
	
	@RequestMapping("test")
	@ResponseBody
	public String test() {
		System.out.println("template.zorro.com");
		return "test template.zorro.com";
	}
}
