package transport;

import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;


public class Main {


    public static void main(String[] args) {
        Driver.FullName fullName = new Driver.FullName("Ivanov", "Ivan", "Ivanovich");
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB(fullName, true, 10 + i);
            Car transport = new Car(null, null, null, driverB);
            System.out.println(transport);
        }

        for (int i = 1; i <= 4; i++) {
            DriverC driverC = new DriverC(fullName, true, 10 + i);
            Truck transport = new Truck(null, null, null, driverC);
            System.out.println(transport);
        }

        for (int i = 1; i <= 4; i++) {
            DriverD driverD = new DriverD(fullName, true, 10 + i);
            Bus transport = new Bus(null, null, null, driverD);
            System.out.println(transport);
        }


    }
}