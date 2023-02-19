package driver;

public class DriverC extends Driver {

    public DriverC(FullName fullName,
                   boolean drivingLicence,
                   int workExperienceInYears) {
        super(fullName, drivingLicence, workExperienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории C " + getFullName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории C " + getFullName() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории C " + getFullName() + " заправляет грузовик");
    }

    @Override
    public String toString() {
        return "DriverC{" + getFullName() +
                ", лицензия - " + getDrivingLicence() +
                ", стаж работы - " + getWorkExperienceInYears() +
                "}";
    }

}
