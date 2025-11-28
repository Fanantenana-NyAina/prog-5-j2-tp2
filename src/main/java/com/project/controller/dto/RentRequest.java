package com.project.controller.dto;

import com.project.entity.mother.RentalItem;
import com.project.entity.mother.Renter;

public class RentRequest {
    Renter renter;
    RentalItem rentItem;

    public RentRequest(){}

    public RentRequest(Renter renter, RentalItem rentItem){
        this.renter = renter;
        this.rentItem = rentItem;
    }

    public Renter getRenter() {
        return renter;
    }

    public RentalItem getRentItem() {
        return rentItem;
    }
}
