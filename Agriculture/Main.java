package Agriculture;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Farmer
        Farmer farmer = new Farmer(
                "Ramesh",
                45,
                "9876543210",
                "F101",
                "Belagavi",
                "20 years"
        );

        // Supervisor
        Supervisor supervisor = new Supervisor(
                "Suresh",
                38,
                "9123456789",
                "W101",
                28000,
                "Field Management",
                12
        );

        // Field Worker
        FieldWorker fieldWorker = new FieldWorker(
                "Mahesh",
                30,
                "9988776655",
                "W102",
                20000,
                "Field A",
                "Crop Maintenance"
        );

        // Organic Farm
        OrganicFarm organicFarm = new OrganicFarm(
                "Green Valley Farm",
                "Belagavi",
                25,
                "Organic Certified",
                "Compost"
        );

        // Commercial Farm
        CommercialFarm commercialFarm = new CommercialFarm(
                "Modern Agriculture Farm",
                "Dharwad",
                50,
                "Agro Industries",
                "Large Scale Production"
        );

        // Smart Farm
        SmartFarm smartFarm = new SmartFarm(
                "Smart Green Farm",
                "Mysore",
                30,
                "Organic Certified",
                "Organic Compost",
                "Soil Moisture Sensor",
                "Automatic Drip Irrigation"
        );

        // Food Crop
        FoodCrop foodCrop = new FoodCrop(
                "Vegetables",
                "Kharif",
                5,
                "Food Crop"
        );

        // Cash Crop
        CashCrop cashCrop = new CashCrop(
                "Sugarcane",
                "Kharif",
                15,
                "Local Sugar Market",
                3500
        );

        // Cereal Crop
        CerealCrop cerealCrop = new CerealCrop(
                "Rice",
                "Kharif",
                10,
                "Food Grain",
                "Basmati",
                4.5
        );

        // Tractor
        Tractor tractor = new Tractor(
                "Tractor",
                "Mahindra",
                750000,
                50,
                "Diesel"
        );

        // Harvester
        Harvester harvester = new Harvester(
                "Rice Harvester",
                "John Deere",
                1800000,
                "Rice",
                2.5
        );

        // Rice Harvest
        RiceHarvest riceHarvest = new RiceHarvest(
                "H101",
                "15-09-2026",
                4.2,
                "Basmati",
                "Grade A"
        );

        // Wheat Harvest
        WheatHarvest wheatHarvest = new WheatHarvest(
                "H102",
                "18-09-2026",
                3.8,
                "Sharbati",
                "Grade A"
        );

        int choice;

        do {

            System.out.println("\n++++++++++++++++++++++++");
            System.out.println("     AGRICULTURE MANAGEMENT SYSTEM");
            System.out.println("++++++++++++++++++++++++\n");

            System.out.println("1. Farmer Details");
            System.out.println("2. Supervisor Details");
            System.out.println("3. Field Worker Details");

            System.out.println("4. Organic Farm Details");
            System.out.println("5. Commercial Farm Details");
            System.out.println("6. Smart Farm Details");

            System.out.println("7. Food Crop Details");
            System.out.println("8. Cash Crop Details");
            System.out.println("9. Cereal Crop Details");

            System.out.println("10. Tractor Details");
            System.out.println("11. Harvester Details");

            System.out.println("12. Rice Harvest Details");
            System.out.println("13. Wheat Harvest Details");

            System.out.println("14. Exit");

            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            System.out.println();

            switch (choice) {

                case 1:
                    farmer.displayFarmer();
                    break;

                case 2:
                    supervisor.displaySupervisor();
                    break;

                case 3:
                    fieldWorker.displayFieldWorker();
                    break;

                case 4:
                    organicFarm.displayOrganicFarm();
                    break;

                case 5:
                    commercialFarm.displayCommercialFarm();
                    break;

                case 6:
                    smartFarm.displaySmartFarm();
                    break;

                case 7:
                    foodCrop.displayFoodCrop();
                    break;

                case 8:
                    cashCrop.displayCashCrop();
                    break;

                case 9:
                    cerealCrop.displayCerealCrop();
                    break;

                case 10:
                    tractor.displayTractor();
                    break;

                case 11:
                    harvester.displayHarvester();
                    break;

                case 12:
                    riceHarvest.displayRiceHarvest();
                    break;

                case 13:
                    wheatHarvest.displayWheatHarvest();
                    break;

                case 14:
                    System.out.println(
                            "Thank you for using Agriculture Management System!"
                    );
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Please try again."
                    );
            }

        } while (choice != 14);

        sc.close();
    }
}
