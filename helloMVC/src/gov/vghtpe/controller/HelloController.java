package gov.vghtpe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import gov.vghtpe.service.TimeService;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	private TimeService ts;
	
	@RequestMapping(method=RequestMethod.GET)
	public String printHello(ModelMap model){
		model.addAttribute("message", "Hello Spring MVC Framework !");
		model.addAttribute("time", ts.getTime());
		return "hello";
	}
	
}
