package com.zdjy.bigdata.temp_charts.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.zdjy.bigdata.temp_charts.entity.Area;

public interface AreaRepository extends JpaRepository<Area,Integer>{
	@Query(value="select province from Area group by province")
	List<String> findProvinces();

	List<Area> findByProvince(String province);

}
