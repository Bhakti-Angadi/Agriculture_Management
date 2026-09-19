package Agriculture;

public class Tractor extends Equipment {

    int horsepower;

    Tractor(String equipmentId, String name, int year, int horsepower, String type) {
        super(equipmentId, name, year, type);
        this.horsepower = horsepower;
    }

    void displayTractor() {
        displayEquipment();
        System.out.println("Horsepower   : " + horsepower);
    }
}