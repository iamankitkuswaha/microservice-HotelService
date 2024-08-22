package com.ankit.hotelservice.controller;

import com.ankit.hotelservice.entity.Hotel;
import com.ankit.hotelservice.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {
    @Autowired
    private HotelService hotelService;
    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
        return new ResponseEntity<>(hotelService.createHotel(hotel), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotels(){
        return new ResponseEntity<>(hotelService.getAllHotels(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Hotel> getHotel(@PathVariable("id") String id){
        return new ResponseEntity<>(hotelService.getHotel(id),HttpStatus.OK);
    }
}
