package com.zdjy.bigdata.temp_charts.service;

import java.util.List;

import com.zdjy.bigdata.temp_charts.entity.Area;

public interface AreaService {
	public List<String> findProvinces();
	public List<Area> findByProvince(String province);
}
