package com.project.service;

import com.project.entity.mother.RentalItem;
import com.project.repository.RentalItemRepository;
import org.springframework.stereotype.Service;

@Service
public class RentalItemService {
    private RentalItemRepository rentalItemRepository;

    public RentalItemService(RentalItemRepository rentalItemRepository) {
        this.rentalItemRepository = rentalItemRepository;
    }

    public String getRentalItemDetails(String rentalItemName){
        var item = rentalItemRepository.findByName(rentalItemName);

        return item.getDetails();
    }

    public Double rentalItemPrice(RentalItem rentalItem){
        return rentalItem.getPrice();
    }
}
