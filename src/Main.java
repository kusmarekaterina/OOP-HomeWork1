import transport.Car;

public class Main {
    public static Car[] cars = new Car [10];

    public static void createCarBook() {
        cars = new Car []{
        new Car("Granta", "", "жёлтого", "Россия", 2015, 1.7, null, "", "", 2, "" ),
        new Car("Audi", "A8 50 L TDI quattro", "чёрного", "Германия", 2020, 3.0,null, "", "", 2,""),
        new Car("BMW", "Z8", "чёрного", "Германия", 2021, 3, null, "", "", 2, ""),
        new Car("Kia", "Sportage 4-го поколения", "красного", "Южная Корея", 2018, 2.4, null, "", "", 2,""),
        new Car("Hyundai", "Avante", null, "Южная Корея", 2016, 1.6, null, "", "", 2,""),
        };
    }

    public static void printCarBook() {
        createCarBook();
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }

    public static void main(String[] args) {

        printCarBook();
    }
}