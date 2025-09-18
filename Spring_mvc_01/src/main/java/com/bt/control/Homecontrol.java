package com.bt.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontrol {

@RequestMapping("/")
public String welcome(){
	
	return "home";
}


}
