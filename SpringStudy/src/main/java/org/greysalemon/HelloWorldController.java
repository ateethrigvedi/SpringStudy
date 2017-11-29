package org.greysalemon;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
	@RequestMapping(value = "/hello" , method = RequestMethod.GET)
	public String SayHello(ModelMap model) {
		model.addAttribute("message", "hello world");
		model.addAttribute("message1", "hello world1");
		
		return "welcome";
	}
	
	@RequestMapping(value = "/helloAgain" , method = RequestMethod.GET)
	public String HelloWorldAgain(ModelMap model) {
		model.addAttribute("message", "hello world again");
		return "welcome";
	}

}
