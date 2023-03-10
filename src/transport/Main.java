package transport;

import driver.Driver;
import driver.DriverB;
import driver.DriverC;
import driver.DriverD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static transport.BodyType.VAN;
import static transport.Transport.getTheMechanicsAtTransport;
import static transport.Transport.getTheNameOfTheDrive;

public class Main {


    public static void main(String[] args) {

        List<Transport> transports = new ArrayList<>();

        ServiceStation queue = new ServiceStation();

        List<Mechanic> mechanics = new ArrayList<>();

        for (int i = 1; i <= 4; i++) {
            Mechanic mechanic = new Mechanic("Иванов", "Иван", "skypro");
            mechanics.add(mechanic);
        }

        Driver.FullName fullName = new Driver.FullName("Ivanov", "Ivan", "Ivanovich");
        Mechanic mechanic1 = mechanics.get(0);
        Mechanic mechanic2 = mechanics.get(2);

        DriverB driverB = null;
        for (int i = 1; i <= 4; i++) {
            driverB = new DriverB(fullName, true, 10 + i);
            Car car = new Car(null, null, null, VAN, driverB, List.of(mechanic1, mechanic2));
//            System.out.println(transport);
            car.makeDiagnosed();
            queue.addTransportToQueue(car);
            queue.carryOutAnInspection(car);
            transports.add(car);
        }

        DriverC driverC = null;
        for (int i = 1; i <= 4; i++) {
            driverC = new DriverC(fullName, true, 10 + i);
            Truck truck = new Truck(null, null, null, LoadCapacity.getValue(120), driverC, List.of(mechanic1, mechanic2));
//            System.out.println(transport);
            truck.makeDiagnosed();
            queue.addTransportToQueue(truck);
            queue.carryOutAnInspection(truck);
            transports.add(truck);
        }

        for (int i = 1; i <= 4; i++) {
            DriverD driverD = new DriverD(fullName, true, 10 + i);
            Bus bus = new Bus(null, null, null, driverD, Size.getValue(10));
            transports.add(bus);
//            System.out.println(transport);
            try {
                bus.makeDiagnosed();
                queue.addTransportToQueue(bus);
                queue.carryOutAnInspection(bus);
            } catch (TransportTypeException e) {
                System.out.println(e.getMessage());
                ;
            }
        }

        Transport auto = transports.get(0);
        mechanics.get(0).carryOutMaintenance(auto);
        mechanics.get(0).fixTheTransport(auto);
        String name = getTheNameOfTheDrive(auto);
        System.out.println(name);

        String list = getTheMechanicsAtTransport(auto);
        System.out.println(list);


        Map<Transport, List<Mechanic>> map = new HashMap<>();
        for (int i=0; i<8; i++) {
            map.put(transports.get(i), List.of(mechanic1, mechanic2));
        }
        for (Map.Entry<Transport, List<Mechanic>> contact : map.entrySet()) {
            System.out.println("Автомобиль: " + contact.getKey() + " Механики: " + contact.getValue());
        }
    }

}