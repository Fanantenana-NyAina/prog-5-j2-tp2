package com.project.manager;

import com.project.entity.mother.RentalItem;
import com.project.entity.mother.Renter;
import com.project.service.RentalItemService;
import com.project.service.RenterService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class RentingManager {
    private static final Logger logger = LoggerFactory.getLogger(RentingManager.class);
    private final RenterService rentingService;
    private final RentalItemService rentalItemService;

    public RentingManager(RenterService rentingService, RentalItemService rentalItemService) {
        this.rentingService = rentingService;
        this.rentalItemService = rentalItemService;
    }

    public Boolean rent(Renter renter, RentalItem item){
        logger.info("{} is trying to rent {}", renter.renterName(), item.getDetails());
        try {
            Boolean isSuccess = rentingService.rentItem(renter, item);
            if (isSuccess) {
                logger.info("Item : {} successfully rented by {}", item.getDetails(), renter.renterName());
            } else {
                logger.warn("Item : {} successfully rented by {}", item.getDetails(), renter.renterName());
            }

            return isSuccess;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String getRentalItemDetails(String rentalItemName){
        return rentalItemService.getRentalItemDetails(rentalItemName);
    }

    public Double getRentalItemPrice(String rentalItemName){
        return rentalItemService.rentalItemPrice(rentalItemName);
    }
}
