package com.project.entity.children;

import com.project.entity.mother.AbstractRentalItem;

public class House extends AbstractRentalItem {
    public House(Double price, String rentalItemName, String rentalItemDescription) {
        super(price, rentalItemName, rentalItemDescription);
    }
}
