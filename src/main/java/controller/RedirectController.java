package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import service.Dataminer;

@Controller
public class RedirectController {
	
	Dataminer service; 
	
	public RedirectController() {
		service = new Dataminer();
	}
	
	@RequestMapping("/")
	public String indexPage() {
	    return "index";
	}
	
	@RequestMapping("/page2")
	public String page2() {
	    return "page2";
	}
}
