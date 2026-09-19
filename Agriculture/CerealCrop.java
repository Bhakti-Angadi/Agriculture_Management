package Agriculture;

public class CerealCrop extends FoodCrop {

    String grainType;
    double expectedYield;

    CerealCrop(String cropName,
               String season,
               double area,
               String foodType,
               String grainType,
               double expectedYield) {

        super(cropName, season, area, foodType);

        this.grainType = grainType;
        this.expectedYield = expectedYield;
    }

    void displayCerealCrop() {

        displayFoodCrop();

        System.out.println("Grain Type      : " + grainType);
        System.out.println("Expected Yield  : " + expectedYield + " tons");
    }
}
