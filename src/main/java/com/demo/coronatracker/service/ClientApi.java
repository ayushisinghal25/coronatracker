package com.demo.coronatracker.service;

import java.util.Collections;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.demo.coronatracker.data.CoronaInfoEndpoints;
import com.demo.coronatracker.data.DataTimeFormatUtils;
import com.demo.coronatracker.model.AllCountriesCasesResponse;
import com.demo.coronatracker.model.TotalCoronaCasesResponse;

@Component
public class ClientApi {

	private Logger logger = LoggerFactory.getLogger(CoronaTrackerService.class);

	private HttpHeaders headers = new HttpHeaders();

	public ClientApi() {

		configureHeader();
	}

	public TotalCoronaCasesResponse getAll(RestTemplate restTemplate) {

		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
		TotalCoronaCasesResponse response = restTemplate
				.exchange(CoronaInfoEndpoints.GET_ALL_DATA, HttpMethod.GET, entity, TotalCoronaCasesResponse.class)
				.getBody();
		logger.info("TotalCoronaCasesResponse := {}", response);

		response.setUpdated(DataTimeFormatUtils.getDataTimeFormat(response.getUpdated()));
		return response;
	}

	public AllCountriesCasesResponse[] getAllCountriesData(RestTemplate restTemplate) {

		HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);

		UriComponentsBuilder builder = UriComponentsBuilder.fromUriString(CoronaInfoEndpoints.GET_ALL_COUNTRIES)
				.queryParam("sort", "cases");

		AllCountriesCasesResponse[] response = restTemplate
				.exchange(builder.toUriString(), HttpMethod.GET, entity, AllCountriesCasesResponse[].class).getBody();
		logger.info("Get all Countries cases := {}", response);

		formatDate(response);
		return response;
	}

	private void configureHeader() {
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.add("user-agent",
				"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");

	}

	private void formatDate(AllCountriesCasesResponse[] response) {
		for (int i = 0; i < response.length; i++) {
			if (response[i].getUpdated() != null) {
				response[i].setUpdated(DataTimeFormatUtils.getDataTimeFormat(response[i].getUpdated()));
			}
		}
	}
}
