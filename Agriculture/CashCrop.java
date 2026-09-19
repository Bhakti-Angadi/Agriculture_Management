package Agriculture;

public class CashCrop extends Crop {

    String market;
    double expectedPrice;

    CashCrop(String cropName, String season,
             double area, String market,
             double expectedPrice) {

        super(cropName, season, area);

        this.market = market;
        this.expectedPrice = expectedPrice;
    }

    void displayCashCrop() {

        displayCrop();

        System.out.println("Market          : " + market);
        System.out.println("Expected Price  : ₹" + expectedPrice);
    }
}
