package Agriculture;

public class Farm {

    String farmName;
    String location;
    double area;

    Farm(String farmName, String location, double area) {

        this.farmName = farmName;
        this.location = location;
        this.area = area;
    }

    void displayFarm() {

        System.out.println("Farm Name : " + farmName);
        System.out.println("Location  : " + location);
        System.out.println("Area      : " + area + " acres");
    }
}
