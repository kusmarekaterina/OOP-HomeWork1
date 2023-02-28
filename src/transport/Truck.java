package transport;

import driver.DriverC;

import java.util.List;

public class Truck extends Transport<DriverC> {

    private LoadCapacity loadCapacity;
    public static int counter = 0;
    private int id;


    public Truck(String brand,
                 String model,
                 Double engineVolume,
                 LoadCapacity loadCapacity,
                 DriverC driver,
                 List<Mechanic> mechanics) {
        super(brand, model, engineVolume, driver, mechanics);
        this.loadCapacity = loadCapacity;
        id = counter++;
    }

    @Override
    public String toString() {
        return "Truck " + id + " {"  +
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
    public void makeDiagnosed() {
        System.out.println("Пройди диагностику!");
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
