package transport;

public class Bus extends Transport {

    public Bus(String brand,String model, Integer year, String country, String color, Integer maxSpeed) {
        super(brand, model, year, country, color, maxSpeed);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
