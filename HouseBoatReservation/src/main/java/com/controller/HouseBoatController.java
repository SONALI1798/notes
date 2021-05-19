package com.controller;


import java.util.HashMap;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.HouseBoatBean;
import com.service.HouseBoatService;

//use appropriate annotation to configure RoomController as Controller
@Controller
public class HouseBoatController {
	@Autowired
	private HouseBoatService houseBoatService;
	

	//invoke the service class - calculateTotalCost method.
	@RequestMapping(value="/billDesk", method=RequestMethod.POST)
	public String calculateTotalCost( @Valid @ModelAttribute("houseBoat") HouseBoatBean houseBoatBean,
			BindingResult result, ModelMap map) {
		if(result.hasErrors())
		{
			return "showpage";
		}
		else {
		double cost= houseBoatService.calculateTotalCost(houseBoatBean);
		map.put("totalcost",cost);

		return "billdesk";
		}
	}
	
	@RequestMapping(value="/showPage", method=RequestMethod.GET)
	public String showPage(@ModelAttribute("houseBoat") HouseBoatBean houseBoatBean,
			BindingResult result, ModelMap map) {
		return "showpage";
		
	}
	@ModelAttribute(name="roomList")
	public Map<String,String> buildState(){
		Map<String,String> roomList = new HashMap<>();
		roomList.put("1BHB", "1BHB");
		roomList.put("2BHB", "2BHB");
		roomList.put("3BHB", "3BHB");
		roomList.put("4BHB", "4BHB");
		roomList.put("6BHB", "6BHB");
		
		return roomList;
	}

}
