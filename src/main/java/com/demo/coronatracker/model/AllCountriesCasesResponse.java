package com.demo.coronatracker.model;

public class AllCountriesCasesResponse {

	private String updated;
	private String country;
	private CountryInfo countryInfo;
	private String cases;
	private String todayCases;
	private String deaths;
	private String todayDeaths;
	private String recovered;
	private String active;

	private static class CountryInfo {
		private String flag;

		public String getFlag() {
			return flag;
		}

		public void setFlag(String flag) {
			this.flag = flag;
		}
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public CountryInfo getCountryInfo() {
		return countryInfo;
	}

	public void setCountryInfo(CountryInfo countryInfo) {
		this.countryInfo = countryInfo;
	}

	public String getCases() {
		return cases;
	}

	public void setCases(String cases) {
		this.cases = cases;
	}

	public String getTodayCases() {
		return todayCases;
	}

	public void setTodayCases(String todayCases) {
		this.todayCases = todayCases;
	}

	public String getDeaths() {
		return deaths;
	}

	public void setDeaths(String deaths) {
		this.deaths = deaths;
	}

	public String getTodayDeaths() {
		return todayDeaths;
	}

	public void setTodayDeaths(String todayDeaths) {
		this.todayDeaths = todayDeaths;
	}

	public String getRecovered() {
		return recovered;
	}

	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}
}