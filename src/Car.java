public class Car {

    private static String defaultBrand ="default";
    private static String defaultColor ="белый";
    private static String defaultModel ="default";
    private static String defaultCountry ="default";
    private static double defaultEngineVolume = 1.5;
    private static int defaultYear = 2000;

    private String brand;
    private String color;
    private String model;
    private double engineVolume;
    private int year;
    private String country;

    Car(String brand, String model, String color, String country, int year, double engineVolume) {
        this.brand = (brand == null || brand.isEmpty() ? defaultBrand : brand);
        this.color = (color == null || color.isEmpty() ? defaultColor : color);
        this.model = (model == null || model.isEmpty() ? defaultModel : model);
        this.engineVolume = (year <= 0 ? defaultEngineVolume : engineVolume);
        this.year = (year <= 0 ? defaultYear : year);
        this.country = (country == null ||country.isEmpty() ? defaultCountry : country);


    }


    public String toString() {
        return brand + " " + model + ", " +
                year + " года выпуска," +
                " сборка в " + country +
                ", " + color + " цвета," +
                " объём двигателя - " + engineVolume + " л.";
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}



