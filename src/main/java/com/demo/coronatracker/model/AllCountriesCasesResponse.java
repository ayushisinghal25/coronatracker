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
	private String critical;
	private String casesPerOneMillion;
	private String deathsPerOneMillion;
	private String tests;
	private String testsPerOneMillion;
	private String continent;

	private static class CountryInfo {
		private String _id;
		private String iso2;
		private String iso3;
		private String lat;
		private String longt;
		private String flag;

		public String getId() {
			return _id;
		}

		public void setId(String id) {
			this._id = id;
		}

		public String getIso2() {
			return iso2;
		}

		public void setIso2(String iso2) {
			this.iso2 = iso2;
		}

		public String getIso3() {
			return iso3;
		}

		public void setIso3(String iso3) {
			this.iso3 = iso3;
		}

		public String getLat() {
			return lat;
		}

		public void setLat(String lat) {
			this.lat = lat;
		}

		public String getLongt() {
			return longt;
		}

		public void setLongt(String longt) {
			this.longt = longt;
		}

		public String getFlag() {
			return flag;
		}

		public void setFlag(String flag) {
			this.flag = flag;
		}

		@Override
		public String toString() {
			return "CountryInfo [id=" + _id + ", iso2=" + iso2 + ", iso3=" + iso3 + ", lat=" + lat + ", longt=" + longt
					+ ", flag=" + flag + "]";
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

	public String getCritical() {
		return critical;
	}

	public void setCritical(String critical) {
		this.critical = critical;
	}

	public String getCasesPerOneMillion() {
		return casesPerOneMillion;
	}

	public void setCasesPerOneMillion(String casesPerOneMillion) {
		this.casesPerOneMillion = casesPerOneMillion;
	}

	public String getDeathsPerOneMillion() {
		return deathsPerOneMillion;
	}

	public void setDeathsPerOneMillion(String deathsPerOneMillion) {
		this.deathsPerOneMillion = deathsPerOneMillion;
	}

	public String getTests() {
		return tests;
	}

	public void setTests(String tests) {
		this.tests = tests;
	}

	public String getTestsPerOneMillion() {
		return testsPerOneMillion;
	}

	public void setTestsPerOneMillion(String testsPerOneMillion) {
		this.testsPerOneMillion = testsPerOneMillion;
	}

	public String getContinent() {
		return continent;
	}

	public void setContinent(String continent) {
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "AllCountriesCases [updated=" + updated + ", country=" + country + ", countryInfo=" + countryInfo
				+ ", cases=" + cases + ", todayCases=" + todayCases + ", deaths=" + deaths + ", todayDeaths="
				+ todayDeaths + ", recovered=" + recovered + ", active=" + active + ", critical=" + critical
				+ ", casesPerOneMillion=" + casesPerOneMillion + ", deathsPerOneMillion=" + deathsPerOneMillion
				+ ", tests=" + tests + ", testsPerOneMillion=" + testsPerOneMillion + ", continent=" + continent + "]";
	}
}