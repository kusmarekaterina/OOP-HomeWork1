package transport;

public class Truck extends Transport {

    public Truck(String brand, String model, Double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
