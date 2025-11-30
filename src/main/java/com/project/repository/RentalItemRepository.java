package com.project.repository;

import com.project.entity.mother.RentalItem;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class RentalItemRepository {
    private final Map<String, RentalItem> stock = new HashMap<>();

    public void save(RentalItem rentalItem) {
        stock.put(rentalItem.getName(), rentalItem);
    }

    public RentalItem findByName(String itemName) {
        return stock.get(itemName);
    }
}
