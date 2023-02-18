package transport;

import static transport.ValidateUtils.validateNum;
import static transport.ValidateUtils.validateString;

public class Transport {
    protected final String brand;
    protected final String model;
    protected final Integer year;
    protected final String country;
    protected String color;
    protected Integer maxSpeed;
    public Transport(String brand,String model, Integer year, String country, String color, Integer maxSpeed) {
        this.color = validateColor(color);
        this.country = validateTransportParameters(country);
        this.brand = validateTransportParameters(brand);
        this.model = validateTransportParameters(model);
        this.year = validateYear(year);
        this.maxSpeed = validateTransportParameters(maxSpeed);
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

    public Integer getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public static String validateTransportParameters(String value) {
        return validateString(value, "default");
    }

    public static Integer validateTransportParameters(Integer value) {
        return validateNum(value, 0);
    }

    public static String validateColor(String value) {
        return validateString(value, "Белый");
    }

    public static Integer validateYear(Integer value) {
        return validateNum(value, 2000);
    }

}
