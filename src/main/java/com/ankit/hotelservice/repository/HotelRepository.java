package com.ankit.hotelservice.repository;

import com.ankit.hotelservice.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
