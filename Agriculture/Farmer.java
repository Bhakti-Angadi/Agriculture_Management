package Agriculture;

public class Farmer extends Person {

    String farmerId;
    String village;
    String experience;

    Farmer(String name, int age, String phone,
           String farmerId, String village,
           String experience) {

        super(name, age, phone);

        this.farmerId = farmerId;
        this.village = village;
        this.experience = experience;
    }

    void displayFarmer() {

        displayPerson();

        System.out.println("Farmer ID   : " + farmerId);
        System.out.println("Village     : " + village);
        System.out.println("Experience  : " + experience);
    }
}