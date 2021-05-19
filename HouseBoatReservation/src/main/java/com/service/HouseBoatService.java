package com.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.model.HouseBoatBean;
//use appropriate annotation to configure HouseBoatService as a Service
@Service
public class HouseBoatService {
	
	public Map<String,Double> costlist = new HashMap<>();
	public HouseBoatService() {
		costlist.put("1BHB",  7000.0);
		costlist.put("2BHB", 10000.0);
		costlist.put("3BHB", 15000.0);
		costlist.put("4BHB", 20000.0);
		costlist.put("6BHB", 25000.0);
		
	}
	
	
	
	public double calculateTotalCost(HouseBoatBean houseBoatBean)
	{
		String type=houseBoatBean.getHouseBoatType();
		double res=costlist.get(type);
		int res1=houseBoatBean.getNoOfDays();
		return res*res1;
		
		
	}

}
	 	  	    	    	     	      	 	
