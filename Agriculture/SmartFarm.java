package Agriculture;

public class SmartFarm extends OrganicFarm {

    String sensorType;
    String irrigationSystem;

    SmartFarm(String farmName, String location,
              double area,
              String certification,
              String fertilizer,
              String sensorType,
              String irrigationSystem) {

        super(farmName, location, area,
              certification, fertilizer);

        this.sensorType = sensorType;
        this.irrigationSystem = irrigationSystem;
    }

    void displaySmartFarm() {

        displayOrganicFarm();

        System.out.println("Sensor Type       : " + sensorType);
        System.out.println("Irrigation System  : " + irrigationSystem);
    }
}