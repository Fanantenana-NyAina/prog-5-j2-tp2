package com.project.entity.mother;

public abstract class AbstractRenter implements Renter {
    private String renterName;

    public AbstractRenter(String renterName) {
        this.renterName = renterName;
    }

    @Override
    public Boolean rent(RentalItem rentalItem) {
        return null;
    }
}
