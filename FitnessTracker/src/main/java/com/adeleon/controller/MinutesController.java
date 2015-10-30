package com.adeleon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.adeleon.model.Exercise;

@Controller
public class MinutesController {
	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise")  Exercise exercite ){
		System.out.println("exercite: "+ exercite.getMinutes() );
		return  "addMinutes";//"redirect:addMoreMinutes.html";
	}
	
	/*@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute ("exercise")  Exercise exercite ){
		System.out.println("exercising: "+ exercite.getMinutes());
		return "addMinutes";
	}*/

}
