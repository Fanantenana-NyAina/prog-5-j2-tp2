package com.project.entity.children;

import com.project.entity.mother.AbstractRentalItem;

public class Computer extends AbstractRentalItem {
    public Computer(Double price, String rentalItemName, String rentalItemDescription) {
        super(price, rentalItemName, rentalItemDescription);
    }
}
