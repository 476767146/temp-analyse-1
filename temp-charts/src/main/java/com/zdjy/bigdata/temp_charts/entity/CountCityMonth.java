package com.zdjy.bigdata.temp_charts.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class CountCityMonth {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String province;
	private String city;
	private String year;
	private String month;
	private Integer max;
	private Integer min;
	private Integer avg;
	private Integer maxDiff;
	private Integer minDiff;
	private Integer avgDiff;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public Integer getMax() {
		return max;
	}
	public void setMax(Integer max) {
		this.max = max;
	}
	public Integer getMin() {
		return min;
	}
	public void setMin(Integer min) {
		this.min = min;
	}
	public Integer getAvg() {
		return avg;
	}
	public void setAvg(Integer avg) {
		this.avg = avg;
	}
	public Integer getMaxDiff() {
		return maxDiff;
	}
	public void setMaxDiff(Integer maxDiff) {
		this.maxDiff = maxDiff;
	}
	public Integer getMinDiff() {
		return minDiff;
	}
	public void setMinDiff(Integer minDiff) {
		this.minDiff = minDiff;
	}
	public Integer getAvgDiff() {
		return avgDiff;
	}
	public void setAvgDiff(Integer avgDiff) {
		this.avgDiff = avgDiff;
	}
	
	
}
