package transport;

import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

import static transport.BodyType.*;

public class Main {


    public static void main(String[] args) {
        Driver.FullName fullName = new Driver.FullName("Ivanov", "Ivan", "Ivanovich");
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB(fullName, true, 10 + i);
            Car transport = new Car(null, null, null, VAN, driverB);
            System.out.println(transport);
            transport.makeDiagnosed();
        }

        for (int i = 1; i <= 4; i++) {
            DriverC driverC = new DriverC(fullName, true, 10 + i);
            Truck transport = new Truck(null, null, null, LoadCapacity.getValue(120), driverC);
            System.out.println(transport);
            transport.makeDiagnosed();
        }

        for (int i = 1; i <= 4; i++) {
            DriverD driverD = new DriverD(fullName, true, 10 + i);
            Bus transport = new Bus(null, null, null, Size.getValue(40), driverD);
            System.out.println(transport);
            try {
                transport.makeDiagnosed();
            } catch (TransportTypeException e) {
                System.out.println(e.getMessage());;
            }
        }



    }
}