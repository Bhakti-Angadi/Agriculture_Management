package Agriculture;

public class FoodCrop extends Crop {

    String foodType;

    FoodCrop(String cropName, String season,
             double area, String foodType) {

        super(cropName, season, area);

        this.foodType = foodType;
    }

    void displayFoodCrop() {

        displayCrop();

        System.out.println("Food Type : " + foodType);
    }
}
