package com.raghu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/***
 * 
 * @author Raghuvanshi
 *
 */
@Controller
public class ViewController {
	
	@RequestMapping("/home")
	public String home(){
		return "home";
	}
	
	
}
