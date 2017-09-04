package com.zdjy.bigdata.temp_charts.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zdjy.bigdata.temp_charts.entity.Area;
import com.zdjy.bigdata.temp_charts.service.AreaService;

@RestController
@RequestMapping("/area")
public class AreaController {
	@Autowired
	private AreaService areaService;
	@RequestMapping("/findProvince")
	public List<String> findProvince(){
		return areaService.findProvinces();
	}
	@RequestMapping("/findByProvince")
	public List<Area> findProvince(String province){
		return areaService.findByProvince(province);
	}
}
