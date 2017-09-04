package com.zdjy.bigdata.temp_charts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zdjy.bigdata.temp_charts.dao.AreaRepository;
import com.zdjy.bigdata.temp_charts.entity.Area;
@Service
public class AreaServiceImpl implements AreaService {
	@Autowired
	private AreaRepository areaRepository;
	@Override
	public List<String> findProvinces() {
		return areaRepository.findProvinces();
	}

	@Override
	public List<Area> findByProvince(String province) {
		return areaRepository.findByProvince(province);
	}

}
