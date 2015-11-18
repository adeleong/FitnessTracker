package com.adeleon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.adeleon.model.Activity;
import com.adeleon.model.Exercise;
import com.adeleon.service.ExerciseService;

@Controller
public class MinutesController {
	
	@Autowired
	private ExerciseService exerciseService;
	
	@RequestMapping(value = "/addMinutes")
	public String addMinutes(@ModelAttribute ("exercise")  Exercise exercite ){
		
		System.out.println("exercite: "+ exercite.getMinutes() );
		System.out.println("exercite Activity: "+ exercite.getActivity() );
		
		return  "addMinutes";//"redirect:addMoreMinutes.html";
	}
	
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public @ResponseBody List<Activity> findAllActivities(){
		
		
		return exerciseService.findAllActivities();
		
	}
	
	/*@RequestMapping(value = "/addMoreMinutes")
	public String addMoreMinutes(@ModelAttribute ("exercise")  Exercise exercite ){
		System.out.println("exercising: "+ exercite.getMinutes());
		return "addMinutes";
	}*/

}
