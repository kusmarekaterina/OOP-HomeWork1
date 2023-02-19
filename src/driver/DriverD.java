package driver;

public class DriverD extends Driver {


    public DriverD(FullName fullName,
                   boolean drivingLicence,
                   int workExperienceInYears) {
        super(fullName, drivingLicence, workExperienceInYears);
    }

    @Override
    public void startMove() {
        System.out.println("Водитель категории D " + getFullName() + " начал движение");
    }

    @Override
    public void finishMove() {
        System.out.println("Водитель категории D " + getFullName() + " закончил движение");
    }

    @Override
    public void refill() {
        System.out.println("Водитель категории D " + getFullName() + " заправляет автобус");
    }

    @Override
    public String toString() {
        return "DriverD{" + getFullName() +
                ", лицензия - " + getDrivingLicence() +
                ", стаж работы - " + getWorkExperienceInYears() +
                "}";
    }
}
