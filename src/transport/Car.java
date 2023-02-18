package transport;
public class Car extends Transport {

    public Car (String brand, String model, Double engineVolume) {
        super (brand, model, engineVolume);
    }

    @Override
    public String toString() {
        return "LightCar{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }
}
//
//import java.util.Calendar;
//
//import static transport.ValidateUtils.*;
//
//
//public class Car extends Transport {
//    private Double engineVolume;
//    private String transmission;
//    private final String bodyType;
//    private String registrationNumber;
//    private final Integer numberOfSeats;
//    private String tires;
//
//
//
//    public Car(String brand, String model, Integer year, String country, String color, Integer maxSpeed, Double engineVolume, String transmission, String bodyType, String registrationNumber, Integer numberOfSeats, String tires) {
//        super(brand,
//                model,
//                year,
//                country,
//                color,
//                maxSpeed);
//        this.engineVolume = validateEngineVolume(engineVolume);
//        this.transmission = validateCarParameters(transmission);
//        this.bodyType = validateCarParameters(bodyType);
//        this.registrationNumber = validateCarParameters(registrationNumber);
//        this.numberOfSeats = validateNumberOfSeats(numberOfSeats);
//        this.tires = ChangeTiresToSeasonal();
//
//    }
//
//
//
//    public String getTransmission() {
//        return transmission;
//    }
//
//    public String getBodyType() {
//        return bodyType;
//    }
//
//    public String getRegistrationNumber() {
//        return registrationNumber;
//    }
//
//    public int getNumberOfSeats() {
//        return numberOfSeats;
//    }
//
//    public String getTires() {
//        return tires;
//    }
//
//    public void setEngineVolume(double engineVolume) {
//        this.engineVolume = engineVolume;
//    }
//
//    public void setTransmission(String transmission) {
//        this.transmission = transmission;
//    }
//
//    public void setRegistrationNumber(String registrationNumber) {
//        this.registrationNumber = registrationNumber;
//    }
//
//    public void setTires(String tires) {
//        this.tires = tires;
//    }
//
//    @Override
//    public String toString() {
//        return "Car{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                ", year=" + year +
//                ", country='" + country + '\'' +
//                ", color='" + color + '\'' +
//                ", maxSpeed=" + maxSpeed +
//                ", engineVolume=" + engineVolume +
//                ", transmission='" + transmission + '\'' +
//                ", bodyType='" + bodyType + '\'' +
//                ", registrationNumber='" + registrationNumber + '\'' +
//                ", numberOfSeats=" + numberOfSeats +
//                ", tires='" + tires + '\'' +
//                '}';
//    }
//
//    public static String validateCarParameters(String value) {
//        return validateString(value, "default");
//    }
//
//    public static Integer validateNumberOfSeats(Integer value) {
//        return (value == null || value < 2 ? 0 : value);
//    }
//
//    public static Double validateEngineVolume(Double value) {
//        return (value == null || value < 0.0 ? 1.5 : value);
//    }
//    private static String ChangeTiresToSeasonal() {
//        switch (Calendar.MONTH){
//            case 0:
//            case 1:
//            case 2:
//            case 3:
//            case 9:
//            case 10:
//            case 11:
//                return "Зимняя резина";
//            default:
//                return "Летняя резина";
//        }
//    }
//
//
//    private static class Key{
//        final private int remoteEngineStart = 1;
//        final private int keylessEntry = 1;
//
//        private void checkParameter(){
//            if (remoteEngineStart != 1){
//                System.out.println("Ошибка");
//            }
//            if (keylessEntry != 1){
//                System.out.println("Ошибка");
//            }
//        }
//
//    }
//}



