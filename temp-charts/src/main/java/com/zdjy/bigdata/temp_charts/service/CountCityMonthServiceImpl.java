package com.zdjy.bigdata.temp_charts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdjy.bigdata.temp_charts.dao.CountCityMonthRepository;
import com.zdjy.bigdata.temp_charts.entity.CountCityMonth;
@Service
public class CountCityMonthServiceImpl implements CountCityMonthService {
	@Autowired
	private CountCityMonthRepository countCityMonthRepository;
	@Override
	public List<CountCityMonth> findByCity(String city) {
		return countCityMonthRepository.findByCity(city);
	}
}
