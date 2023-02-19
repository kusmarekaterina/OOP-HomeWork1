package driver;

public class DriverB extends Driver {

    public DriverB(FullName fullName,
                   boolean drivingLicence,
                   int workExperienceInYears) {
        super(fullName, drivingLicence, workExperienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории В " + getFullName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории В " + getFullName() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории В " + getFullName() + " заправляет автомобиль");
    }

    @Override
    public String toString() {
        return "DriverB{" + getFullName() +
                ", лицензия - " + getDrivingLicence() +
                ", стаж работы - " + getWorkExperienceInYears() +
                "}";
    }
}
