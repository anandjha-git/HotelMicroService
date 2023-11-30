package com.lcwd.hotel.service.services;

import java.util.List;

import com.lcwd.hotel.service.entities.Hotel;

public interface HotelService {
	
	//create
	Hotel create(Hotel hotel);
	
	//get all
	List<Hotel> getAll();
	
	//get single
	Hotel get(String id);
	
	

}
