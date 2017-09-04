package com.zdjy.bigdata.temp_charts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.zdjy.bigdata.temp_charts.dao.CountCityMonthRepository;
import com.zdjy.bigdata.temp_charts.entity.CountCityMonth;
@Service
public class CountCityMonthServiceImpl implements CountCityMonthService {
	@Autowired
	private CountCityMonthRepository countCityMonthRepository;
	@Override
	public List<CountCityMonth> findByCity(String city) {
		Sort sort = new Sort(Sort.Direction.ASC, "year","month");
		return countCityMonthRepository.findByCity(sort,city);
	}
}
