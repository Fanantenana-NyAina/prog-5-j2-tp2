package com.project.service;

import com.project.entity.mother.RentalItem;
import com.project.entity.mother.Renter;
import org.springframework.stereotype.Service;

@Service
public class RentingService {
    public Boolean rentItem(Renter renter, RentalItem item){
        return renter.rent(item);
    }
}
