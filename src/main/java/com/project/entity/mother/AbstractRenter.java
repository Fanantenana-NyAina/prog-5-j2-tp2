package com.project.entity.mother;

public abstract class AbstractRenter implements Renter {
    private final String renterName;

    public AbstractRenter(String renterName) {
        this.renterName = renterName;
    }

    @Override
    public Boolean rent(RentalItem rentalItem) {
        if(rentalItem.getIsRent())
            return false;

        if (rentalItem instanceof AbstractRentalItem)
            ((AbstractRentalItem) rentalItem).setRented(true);

        return true;
    }
}
