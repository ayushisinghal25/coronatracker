package com.demo.coronatracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.coronatracker.model.AllCountriesCasesResponse;
import com.demo.coronatracker.model.TotalCoronaCasesResponse;
import com.demo.coronatracker.service.CoronaTrackerService;

@RestController
public class CoronaController implements ErrorController{

	@Autowired
	private CoronaTrackerService coronaTrackerService;
	
	@GetMapping(path="/coronatracker")
	public ModelAndView getAll() {
		ModelAndView modelAndView = new ModelAndView();    
        modelAndView.setViewName("index");        
        
        TotalCoronaCasesResponse totalCases = coronaTrackerService.getAll();
        modelAndView.addObject("totalcoronacases", totalCases);    
        
        AllCountriesCasesResponse[] allCountriesCases = coronaTrackerService.getAllCountriesData();
        modelAndView.addObject("allcountriescases", allCountriesCases); 
        return modelAndView;    
	}
	
	@GetMapping(path="/echo")
	public String echo() {
        return "echo successful";
	}

	@Override
	@RequestMapping("/error")
	@ResponseBody
	public String getErrorPath() {
		return "<center><h1>Something went wrong. Please retry.</h1></center>";
	}
}
