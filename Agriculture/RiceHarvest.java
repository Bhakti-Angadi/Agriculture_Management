package Agriculture;

public class RiceHarvest extends Harvest {

    String riceVariety;
    String quality;

    RiceHarvest(String harvestId,
                String date,
                double quantity,
                String riceVariety,
                String quality) {

        super(harvestId, date, quantity);

        this.riceVariety = riceVariety;
        this.quality = quality;
    }

    void displayRiceHarvest() {

        displayHarvest();

        System.out.println("Rice Variety : " + riceVariety);
        System.out.println("Quality      : " + quality);
    }
}
