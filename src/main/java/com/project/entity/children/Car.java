package com.project.entity.children;

import com.project.entity.mother.AbstractRentalItem;

public class Car extends AbstractRentalItem {
    public Car(Double price, String rentalItemName, String rentalItemDescription) {
        super(price, rentalItemName, rentalItemDescription);
    }
}
