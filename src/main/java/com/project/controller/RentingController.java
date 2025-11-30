package com.project.controller;

import com.project.controller.dto.RentRequest;
import com.project.manager.RentingManager;
import org.springframework.web.bind.annotation.*;

@RestController
public class RentingController {
    private final RentingManager  rentingManager;

    public RentingController(RentingManager rentingManager) {
        this.rentingManager = rentingManager;
    }

    @GetMapping("/ping")
    public String pingPong(){
        return "pong";
    }

    @PostMapping("/rent")
    public Boolean rent(@RequestBody RentRequest rentRequest){
        return rentingManager.rent(rentRequest.getRenter(), rentRequest.getRentItem());
    }

    @GetMapping("/rentalItem/details")
    public String rentalItemDetails(@RequestParam("itemName") String itemName){
        return rentingManager.getRentalItemDetails(itemName);
    }

    @GetMapping("/rentalItem/price")
    public Double rentalItemPrice(@RequestParam("itemName") String itemName){
        return rentingManager.getRentalItemPrice(itemName);
    }
}
