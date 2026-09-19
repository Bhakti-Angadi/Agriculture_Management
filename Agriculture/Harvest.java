package Agriculture;

public class Harvest {

    String harvestId;
    String date;
    double quantity;

    Harvest(String harvestId, String date, double quantity) {
        this.harvestId = harvestId;
        this.date = date;
        this.quantity = quantity;
    }

    void displayHarvest() {
        System.out.println("Harvest ID : " + harvestId);
        System.out.println("Date       : " + date);
        System.out.println("Quantity   : " + quantity + " kg");
    }
}