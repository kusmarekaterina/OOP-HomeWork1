package transport;

import driver.DriverC;

public class Truck extends Transport<DriverC> {

    private LoadCapacity loadCapacity;

    public Truck(String brand,
                 String model,
                 Double engineVolume,
                 LoadCapacity loadCapacity,
                 DriverC driver) {
        super(brand, model, engineVolume, driver);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() + ", " + loadCapacity +
                ", driver=" + getDriver() +
                '}';
    }

    @Override
    public Type printType() {
        return Type.TRUCK;
    }

    @Override
    public void PitStop() {
        System.out.println("Пит-стоп у грузовика");
    }

    @Override
    public void theBestLapTime() {
        int minMinute = 90;
        int maxMinute = 130;
        int theBestTime = (int)(minMinute + (maxMinute - minMinute) * Math.random());

        System.out.println("Лучшее время круга для грузовиков в минутах" + theBestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 90;
        int maxBound = 140;
        int maxSpeed = (int)(minBound + (maxBound - minBound) * Math.random());

        System.out.println("Максимальное время для грузовиков " + maxSpeed);
    }
}
