package com.lcwd.hotel.service.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lcwd.hotel.service.entities.Hotel;
import com.lcwd.hotel.service.exceptions.ResourceNotFoundException;
import com.lcwd.hotel.service.repositories.HotelRepo;
import com.lcwd.hotel.service.services.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelRepo hotelRepository;
	
	@Override
	public Hotel create(Hotel hotel) {
		String hotelId = UUID.randomUUID().toString();
		hotel.setId(hotelId);
		return hotelRepository.save(hotel);
	}

	@Override
	public List<Hotel> getAll() {
			return hotelRepository.findAll();
	}

	@Override
	public Hotel get(String id) {
		return hotelRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Hotel with given id is not found !!"));
	}

}
