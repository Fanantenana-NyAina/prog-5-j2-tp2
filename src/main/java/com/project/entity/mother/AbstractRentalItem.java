package com.project.entity.mother;

public abstract class AbstractRentalItem implements RentalItem {
    private Double price;
    private String rentalItemName;
    private String rentalItemDescription;
    private Boolean isRented;

    public AbstractRentalItem(Double price, String rentalItemName, String rentalItemDescription) {
        this.price = price;
        this.rentalItemName = rentalItemName;
        this.rentalItemDescription = rentalItemDescription;
        this.isRented = false;
    }

    @Override
    public String getName() {
        return this.rentalItemName;
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
                this.rentalItemName
                        + "\nDescription :"+this.rentalItemDescription
                        + "\nAvalaible : " + isRented
        );
    }

    public void setRented(Boolean rented) {
        isRented = rented;
    }
}
