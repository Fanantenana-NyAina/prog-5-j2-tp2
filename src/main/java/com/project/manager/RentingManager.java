package com.project.manager;

import com.project.entity.mother.RentalItem;
import com.project.entity.mother.Renter;
import com.project.service.RentalItemService;
import com.project.service.RenterService;
import org.springframework.stereotype.Component;

@Component
public class RentingManager {
    private final RenterService rentingService;
    private final RentalItemService rentalItemService;

    public RentingManager(RenterService rentingService, RentalItemService rentalItemService) {
        this.rentingService = rentingService;
        this.rentalItemService = rentalItemService;
    }

    public Boolean rent(Renter renter, RentalItem item){
        return rentingService.rentItem(renter, item);
    }

    public String getRentalItemDetails(String rentalItemName){
        return rentalItemService.getRentalItemDetails(rentalItemName);
    }

    public Double getRentalItemPrice(RentalItem item){
        return rentalItemService.rentalItemPrice(item);
    }
}
