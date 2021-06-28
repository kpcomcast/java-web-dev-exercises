package org.launchcode.java.studios.restaurantmenu;

public class MenuItem {
    private double price;
    private String description;
    private String category;
    private boolean oldNew;

    public MenuItem(double price, String description, String category, boolean oldNew) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.oldNew = oldNew;
    }

    public boolean isOldNew() {
        return oldNew;
    }
    public void setOldNew(boolean oldNew) {
        this.oldNew = oldNew;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double aPrice) {
        price = aPrice;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String aDescription) {
        description = aDescription;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String aCategory) {
        category = aCategory;
    }




}
