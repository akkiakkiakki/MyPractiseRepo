package com.AllInOneDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController
{
	@RequestMapping("/")
	public String home()
	{
		System.out.println("akk");
		return "index";
	}
}