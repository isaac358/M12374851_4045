package com.plantplaces;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Administrator
 * @main Class
 */
@Controller
public class plAntPlacesControler {

	@RequestMapping("/start")
	public String start() {
		return "start";
		
	}
}
