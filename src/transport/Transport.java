package transport;

import driver.Driver;

import java.util.Date;

import static transport.ValidateUtils.validateString;
public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private Double engineVolume;
    private T driver;
//    protected final Integer year;
//    protected final String country;
//    protected String color;
//    protected Integer maxSpeed;
    public Transport(String brand,String model, Double engineVolume, T driver) {
//        this.color = validateColor(color);
//        this.country = validateTransportParameters(country);
        this.brand = validateTransportParameters(brand);
        this.model = validateTransportParameters(model);
        this.engineVolume = validateEngineVolume(engineVolume);
//        this.year = validateYear(year);
//        this.maxSpeed = validateTransportParameters(maxSpeed);
        setDriver(driver);
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
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
                ", driver=" + driver +
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

    public Date finishedMoving(){
        Date date = new Date();
        return date;
    }

    public abstract Type printType();

    public abstract void makeDiagnosed() throws TransportTypeException;



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

