package com.zdjy.bigdata.temp_charts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zdjy.bigdata.temp_charts.entity.CountCityMonth;

public interface CountCityMonthRepository extends JpaRepository<CountCityMonth,Integer>{

	List<CountCityMonth> findByCity(String city);

}
