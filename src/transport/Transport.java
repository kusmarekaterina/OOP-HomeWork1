package transport;

import java.util.Date;

import static transport.ValidateUtils.validateString;
public abstract class Transport {
    protected final String brand;
    protected final String model;
    protected Double engineVolume;
//    protected final Integer year;
//    protected final String country;
//    protected String color;
//    protected Integer maxSpeed;
    public Transport(String brand,String model, Double engineVolume) {
//        this.color = validateColor(color);
//        this.country = validateTransportParameters(country);
        this.brand = validateTransportParameters(brand);
        this.model = validateTransportParameters(model);
        this.engineVolume = validateEngineVolume(engineVolume);
//        this.year = validateYear(year);
//        this.maxSpeed = validateTransportParameters(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

//    public String getColor() {
//        return color;
//    }

    public String getModel() {
        return model;
    }

//    public Integer getYear() {
//        return year;
//    }

//    public String getCountry() {
//        return country;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }


    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }


    public static String validateTransportParameters(String value) {
        return validateString(value, "default");
    }

    public static Double validateEngineVolume(Double value) {
        return (value == null || value < 0.0 ? 1.5 : value);
    }

    public Date startMoving(){
        Date date = new Date();
        return date;
    }

    public Date finishedMoving(int i){
        Date date = new Date();
        return date;
    }

//    public static Integer validateTransportParameters(Integer value) {
//        return validateNum(value, 0);
//    }
//
//    public static String validateColor(String value) {
//        return validateString(value, "Белый");
//    }
//
//    public static Integer validateYear(Integer value) {
//        return validateNum(value, 2000);
//    }

}

