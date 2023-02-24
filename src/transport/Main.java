package transport;

import driver.*;

import static transport.BodyType.*;

public class Main {


    public static void main(String[] args) {
        Driver.FullName fullName = new Driver.FullName("Ivanov", "Ivan", "Ivanovich");
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB(fullName, true, 10 + i);
            Car transport = new Car(null, null, null, VAN, driverB);
            System.out.println(transport);
        }

        for (int i = 1; i <= 4; i++) {
            DriverC driverC = new DriverC(fullName, true, 10 + i);
            Truck transport = new Truck(null, null, null, LoadCapacity.getValue(120), driverC);
            System.out.println(transport);
        }

        for (int i = 1; i <= 4; i++) {
            DriverD driverD = new DriverD(fullName, true, 10 + i);
            Bus transport = new Bus(null, null, null, Size.getValue(40), driverD);
            System.out.println(transport);
        }

    }
}