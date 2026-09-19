package Agriculture;

public class WheatHarvest extends Harvest {

    String wheatVariety;
    String quality;

    WheatHarvest(String harvestId,
                 String date,
                 double quantity,
                 String wheatVariety,
                 String quality) {

        super(harvestId, date, quantity);

        this.wheatVariety = wheatVariety;
        this.quality = quality;
    }

    void displayWheatHarvest() {

        displayHarvest();

        System.out.println("Wheat Variety : " + wheatVariety);
        System.out.println("Quality       : " + quality);
    }
}
