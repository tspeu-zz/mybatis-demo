package com.example.demomybatis2;

import java.util.Collection;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CarMapper {
	
	@Options(useGeneratedKeys = true)
	@Insert("insert into car(make, model, year) values(#{make}, #{model}, #{year} ) ")
	void insert(Car car);
	
	
	@Select("Select all from CAR")
	Collection <Car> selecAll();
	

	
	
}
