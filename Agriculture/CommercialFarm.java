package Agriculture;

public class CommercialFarm extends Farm {

    String companyName;
    String productionType;

    CommercialFarm(String farmName, String location,
                   double area,
                   String companyName,
                   String productionType) {

        super(farmName, location, area);

        this.companyName = companyName;
        this.productionType = productionType;
    }

    void displayCommercialFarm() {

        displayFarm();

        System.out.println("Company Name  : " + companyName);
        System.out.println("Production    : " + productionType);
    }
}
