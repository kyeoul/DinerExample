package com.example.dinerexample;

public class Food {

    private String foodName;
    private String description;
    private double price;
    private int imageResourseID;

    public Food(String foodName, String description, double price, int imageResourseID){
        this.foodName = foodName;
        this.description = description;
        this.price = price;
        this.imageResourseID = imageResourseID;
    }

    public static final Food[] breakFastFoods = {
            new Food("Eggs", "3 eggs, 1 cheese, 1 meat omelet", 8.99, R.drawable.omelet),
            new Food("Pancakes", "3 pancakes, choice of meat, potato", 7.95, R.drawable.pancakes),
            new Food("Waffles", "Belgium waffles, whip cream, fresh fruit", 7.50, R.drawable.waffles)
    };

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getImageResourseID() {
        return imageResourseID;
    }

    public void setImageResourseID(int imageResourseID) {
        this.imageResourseID = imageResourseID;
    }

    public String toString(){
        return foodName;
    }
}
