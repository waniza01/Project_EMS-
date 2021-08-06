
package com.ems;


class FoodManagement {
   
    private int foodId;
    private String foodName;
    private double foodCost;
    private String foodImage;

    public FoodManagement() {
    }

    public FoodManagement(String foodName, double foodCost, String foodImage) {
        this.foodName = foodName;
        this.foodCost = foodCost;
        this.foodImage = foodImage;
    }

    public FoodManagement(int foodId, String foodName, double foodCost, String foodImage) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodCost = foodCost;
        this.foodImage = foodImage;
    }

    public FoodManagement(String foodName, double foodCost) {
        this.foodName = foodName;
        this.foodCost = foodCost;
    }
    
    

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public double getFoodCost() {
        return foodCost;
    }

    public void setFoodCost(double foodCost) {
        this.foodCost = foodCost;
    }

    public String getFoodImage() {
        return foodImage;
    }

    public void setFoodImage(String foodImage) {
        this.foodImage = foodImage;
    }

    @Override
    public String toString() {
        return  foodName + "    :     " + foodCost;
    }

    
    
    
}

