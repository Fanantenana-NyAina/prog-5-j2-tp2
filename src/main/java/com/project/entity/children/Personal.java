package com.project.entity.children;

import com.project.entity.mother.AbstractRenter;
import com.project.entity.mother.RentalItem;

public class Personal extends AbstractRenter {
    public Personal(String renterName) {
        super(renterName);
    }

    @Override
    public Boolean rent(RentalItem rentalItem) {
        return null;
    }
}
