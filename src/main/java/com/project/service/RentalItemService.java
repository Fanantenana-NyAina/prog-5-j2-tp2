package com.project.service;

import com.project.entity.mother.RentalItem;
import org.apache.commons.lang3.NotImplementedException;
import org.springframework.stereotype.Service;

@Service
public class RentalItemService {
    public String getRentalItemDetails(RentalItem rentalItem){
        return rentalItem.getDetails();
    }

    public Double rentalItemPrice(RentalItem rentalItem){
        return rentalItem.getPrice();
    }

    public RentalItem findByName(String rentalItemName){
        throw new NotImplementedException("not implemented yet");
    }
}
