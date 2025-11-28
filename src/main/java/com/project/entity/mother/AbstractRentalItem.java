package com.project.entity.mother;

public abstract class AbstractRentalItem implements RentalItem {
    private Double price;
    private String RentalItemName;
    private String RentalItemDescription;
    private Boolean isRented;

    public AbstractRentalItem(Double price, String rentalItemName, String rentalItemDescription) {
        this.price = price;
        this.RentalItemName = rentalItemName;
        this.RentalItemDescription = rentalItemDescription;
        this.isRented = false;
    }

    @Override
    public Boolean getIsRent() {
        return isRented;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String getDetails() {
        return (
                this.RentalItemName
                        + "\nDescription :"+this.RentalItemDescription
                        + "\nAvalaible : " + isRented
        );
    }

    public void setRented(Boolean rented) {
        isRented = rented;
    }
}
