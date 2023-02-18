package transport;

public class Main {
    public static Transport [] transports = new Transport [10];

    public static void createTransportBook() {
        transports = new Transport []{
        new Car (null, null, null),
        new Bus(null, null, null),
        new Truck(null, null, null),
        new Truck (null, null, null),
        };
    }

    public static void printTransportBook() {
        createTransportBook();
        for (Transport transport : transports) {
            System.out.println(transport);
        }
    }

    public static void main(String[] args) {
        printTransportBook();
    }
}