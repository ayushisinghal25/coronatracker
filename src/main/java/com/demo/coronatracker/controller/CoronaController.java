package com.demo.coronatracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.demo.coronatracker.model.AllCountriesCasesResponse;
import com.demo.coronatracker.model.TotalCoronaCasesResponse;
import com.demo.coronatracker.service.CoronaTrackerService;

@Controller
public class CoronaController implements ErrorController {

	@Autowired
	private CoronaTrackerService coronaTrackerService;

	@GetMapping(path = "/")
	public ModelAndView getAll(ModelAndView modelAndView) {

		TotalCoronaCasesResponse totalStats = coronaTrackerService.getAll();
		modelAndView.addObject("totalStats", totalStats);

		AllCountriesCasesResponse[] countriesStats = coronaTrackerService.getAllCountriesData();
		modelAndView.addObject("countriesStats", countriesStats);

		modelAndView.setViewName("index");

		return modelAndView;
	}

	@Override
	@RequestMapping("/error")
	@ResponseBody
	public String getErrorPath() {
		return "<center><h1>Something went wrong. Please retry.</h1></center>";
	}
}
