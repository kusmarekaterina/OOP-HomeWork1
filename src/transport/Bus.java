package transport;

import driver.DriverD;

public class Bus extends Transport<DriverD> {

    private Size size;
    public static int counter = 0;
    private int id;

//    public Bus(String brand,String model, Integer year, String country, String color, Integer maxSpeed) {
//        super(brand, model, year, country, color, maxSpeed);
//    }
//
//    @Override
//    public String toString() {
//        return "Bus{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", year=" + year +
//                ", country='" + country + '\'' +
//                ", color='" + color + '\'' +
//                ", maxSpeed=" + maxSpeed +
//                '}';
//    }


    public Bus(String brand,
               String model,
               Double engineVolume,
               DriverD driver,
               Size size) {
        super(brand, model, engineVolume, driver);
        this.size = size;
        id = counter++;
    }

    @Override
    public String toString() {
        return "Bus " + id + " {" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() + ", " + size +
                ", driver=" + getDriver() +
                '}';
    }

    @Override
    public Type printType() {
        return Type.BUS;
    }

    @Override
    public void makeDiagnosed() throws TransportTypeException {
        throw new TransportTypeException ("Автобусы диагностику проходить не должны!");
    }

    @Override
    public void PitStop() {
        System.out.println("Пит-стоп у автобуса");
    }

    @Override
    public void theBestLapTime() {
        int minMinute = 100;
        int maxMinute = 150;
        int theBestTime = (int)(minMinute + (maxMinute - minMinute) * Math.random());

        System.out.println("Лучшее время круга для автобусов в минутах" + theBestTime);
    }

    @Override
    public void maxSpeed() {
        int minBound = 80;
        int maxBound = 120;
        int maxSpeed = (int)(minBound + (maxBound - minBound) * Math.random());

        System.out.println("Максимальное время для автобусов " + maxSpeed);
    }
}
