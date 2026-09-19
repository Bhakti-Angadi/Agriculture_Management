package Agriculture;

public class Harvester extends Equipment {

    double capacity;

    Harvester(String equipmentId, String name, int year, String type, double capacity) {
        super(equipmentId, name, year, type);
        this.capacity = capacity;
    }

    void displayHarvester() {
        displayEquipment();
        System.out.println("Capacity     : " + capacity + " kg");
    }
}