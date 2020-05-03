package com.demo.coronatracker.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.demo.coronatracker.model.AllCountriesCasesResponse;
import com.demo.coronatracker.model.TotalCoronaCasesResponse;

@Service
public class CoronaTrackerService {

	private Logger logger = LoggerFactory.getLogger(CoronaTrackerService.class);

	private RestTemplate restTemplate;
	private ClientApi clientApi;

	public CoronaTrackerService(ClientApi clientApi, RestTemplate restTemplate) {
		this.clientApi = clientApi;
		this.restTemplate = restTemplate;
	}

	// @PostConstruct
	// @Scheduled(cron="* * * * * *")
	public TotalCoronaCasesResponse getAll() {

		try {
			return clientApi.getAll(restTemplate);
		} catch (Exception ex) {
			logger.info("exception");
		}
		return null;
	}

	public AllCountriesCasesResponse[] getAllCountriesData() {

		try {
			return clientApi.getAllCountriesData(restTemplate);
		} catch (Exception ex) {
			logger.info("exception");
		}
		return null;
	}
}
