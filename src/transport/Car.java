package transport;

import java.util.Calendar;


public class Car {

    final private static String defaultBrand ="default";
    final private static String defaultColor ="белый";
    final private static String defaultModel ="default";
    final private static String defaultCountry ="default";
    final private static double defaultEngineVolume = 1.5;
    final private static int defaultYear = 2000;
    final private static String defaultTransmission ="default";
    final private static String defaultBodyType ="default";
    final private static String defaultRegistrationNumber ="default";
    final private static int defaultNumberOfSeats = 2;




    final private String brand;
    private String color;
    final private String model;
    private double engineVolume;
    final private int year;
    final private String country;
    private String transmission;
    final private String bodyType;
    private String registrationNumber;
    final private int numberOfSeats;
    private String tires;



    public Car(String brand, String model, String color, String country, int year, double engineVolume, String transmission, String bodyType, String registrationNumber, int numberOfSeats, String tires) {
        this.brand = (brand == null || brand.isEmpty() ? defaultBrand : brand);
        this.color = (color == null || color.isEmpty() ? defaultColor : color);
        this.model = (model == null || model.isEmpty() ? defaultModel : model);
        this.engineVolume = (year <= 0 ? defaultEngineVolume : engineVolume);
        this.year = (year <= 0 ? defaultYear : year);
        this.country = (country == null ||country.isEmpty() ? defaultCountry : country);
        this.transmission = (transmission == null || brand.isEmpty() ? defaultTransmission : transmission);
        this.bodyType = (bodyType == null || brand.isEmpty() ? defaultBodyType : bodyType);
        this.registrationNumber = (registrationNumber == null || brand.isEmpty() ? defaultRegistrationNumber : registrationNumber);
        this.numberOfSeats = (numberOfSeats < 2 ? defaultNumberOfSeats : numberOfSeats);
        this.tires = ChangeTiresToSeasonal();

    }
    private static class Key{
        final private int remoteEngineStart = 1;
        final private int keylessEntry = 1;

        private void checkParameter(){
            if (remoteEngineStart != 1){
                System.out.println("Ошибка");
            }
            if (keylessEntry != 1){
                System.out.println("Ошибка");
            }
        }

    }

    private static String ChangeTiresToSeasonal() {
        switch (Calendar.MONTH){
            case 0:
            case 1:
            case 2:
            case 3:
            case 9:
            case 10:
            case 11:
                return "Зимняя резина";
            default:
                return "Летняя резина";
        }
    }


    public String toString() {
        return brand + " " + model + ", " +
                year + " года выпуска," +
                " сборка в " + country +
                ", " + color + " цвета," +
                " объём двигателя - " + engineVolume + " л." +
                " коробка передач - " + transmission + ", " +
                "тип кузова - " + bodyType + ", " +
                "регистрационный номер - " + registrationNumber + ", " +
                "количество мест - " + numberOfSeats + ", " +
                tires
                ;
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

    public String getTransmission() {
        return transmission;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTires() {
        return tires;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }
}



