package com.zdjy.bigdata.temp_charts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zdjy.bigdata.temp_charts.entity.CountCityMonth;
import com.zdjy.bigdata.temp_charts.service.CountCityMonthService;

@RestController
@RequestMapping("/countCityMonth")
public class CountCityMonthController {
	@Autowired
	private CountCityMonthService countCityMonthService;
	@RequestMapping("/findByCity")
	public List<CountCityMonth> findById(String city){
		return countCityMonthService.findByCity(city);
	}
	
}
