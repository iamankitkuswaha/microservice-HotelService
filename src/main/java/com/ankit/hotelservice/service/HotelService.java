package com.ankit.hotelservice.service;

import com.ankit.hotelservice.entity.Hotel;

import java.util.List;

public interface HotelService {
    Hotel createHotel(Hotel hotel);
    List<Hotel> getAllHotels();
    Hotel getHotel(String id);
}
