package com.project.manager;

import com.project.entity.mother.RentalItem;
import com.project.entity.mother.Renter;
import com.project.service.RentingService;
import org.springframework.stereotype.Component;

@Component
public class RentingManager {
    private final RentingService rentingService;

    public RentingManager(RentingService rentingService) {
        this.rentingService = rentingService;
    }

    public Boolean rent(Renter renter, RentalItem item){
        return rentingService.rentItem(renter, item);
    }
}
