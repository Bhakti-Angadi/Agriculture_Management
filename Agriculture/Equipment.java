package Agriculture;

public class Equipment {
    String equipmentId;
    String name;
    int year;
    String type;

    Equipment(String equipmentId, String name, int year, String type) {
        this.equipmentId = equipmentId;
        this.name = name;
        this.year = year;
        this.type = type;
    }

    void displayEquipment() {
        System.out.println("Equipment ID : " + equipmentId);
        System.out.println("Name         : " + name);
        System.out.println("Year         : " + year);
        System.out.println("Type         : " + type);
    }
}