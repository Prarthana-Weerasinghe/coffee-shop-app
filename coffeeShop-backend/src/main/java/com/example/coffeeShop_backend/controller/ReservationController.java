package com.example.coffeeShop_backend.controller;

import com.example.coffeeShop_backend.entity.Reservation;
import com.example.coffeeShop_backend.repo.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations")
@CrossOrigin(origins = "http://localhost:3000")
public class ReservationController {

    @Autowired
    private ReservationRepository reservationRepository;

    @PostMapping
    public Reservation createReservation(@RequestBody Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
