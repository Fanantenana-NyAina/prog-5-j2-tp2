package com.project.service;

import com.project.exception.NotFoundException;
import com.project.repository.RentalItemRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class RentalItemService {
    private static final Logger logger = LoggerFactory.getLogger(RentalItemService.class);
    private final RentalItemRepository rentalItemRepository;

    public RentalItemService(RentalItemRepository rentalItemRepository) {
        this.rentalItemRepository = rentalItemRepository;
    }

    public String getRentalItemDetails(String rentalItemName){
        logger.info("getting rental item details {}", rentalItemName);
        var item = rentalItemRepository.findByName(rentalItemName);

        if(item == null){
            logger.warn("rental item not found {}", rentalItemName);
            throw new NotFoundException("rental item not found " + rentalItemName );
        }

        return item.getDetails();
    }

    public Double rentalItemPrice(String rentalItemName){
        logger.info("getting rental item price {}", rentalItemName);
        var item =  rentalItemRepository.findByName(rentalItemName);

        if(item == null){
            logger.warn("rental item not found {}", rentalItemName);
            throw new NotFoundException("rental item not found " + rentalItemName );
        }

        return item.getPrice();
    }
}
