package Agriculture;

public class Crop {

    String cropName;
    String season;
    double area;

    Crop(String cropName, String season, double area) {

        this.cropName = cropName;
        this.season = season;
        this.area = area;
    }

    void displayCrop() {

        System.out.println("Crop Name : " + cropName);
        System.out.println("Season    : " + season);
        System.out.println("Area      : " + area + " acres");
    }
}
