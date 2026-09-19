package Agriculture;

public class OrganicFarm extends Farm {

    String certification;
    String fertilizer;

    OrganicFarm(String farmName, String location,
                double area,
                String certification,
                String fertilizer) {

        super(farmName, location, area);

        this.certification = certification;
        this.fertilizer = fertilizer;
    }

    void displayOrganicFarm() {

        displayFarm();

        System.out.println("Certification : " + certification);
        System.out.println("Fertilizer    : " + fertilizer);
    }
}
