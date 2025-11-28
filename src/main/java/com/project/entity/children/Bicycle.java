package com.project.entity.children;

import com.project.entity.mother.AbstractRentalItem;

public class Bicycle extends AbstractRentalItem {
    public Bicycle(Double price, String rentalItemName, String rentalItemDescription) {
        super(price, rentalItemName, rentalItemDescription);
    }
}
