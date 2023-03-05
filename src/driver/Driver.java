package driver;

import java.util.Objects;

public abstract class Driver {

    private FullName fullName;
    private boolean drivingLicence;
    private int workExperienceInYears;

    protected Driver(FullName fullName, boolean drivingLicence, int workExperienceInYears) {
        this.fullName = fullName;
        this.drivingLicence = drivingLicence;
        this.workExperienceInYears = workExperienceInYears;
    }

    public FullName getFullName() {
        return fullName;
    }

    public void setFullName(FullName fullName) {
        this.fullName = fullName;
    }

    public boolean getDrivingLicence() {
        return drivingLicence;
    }

    public void setDrivingLicence(boolean drivingLicence) {
        this.drivingLicence = drivingLicence;
    }

    public int getWorkExperienceInYears() {
        return workExperienceInYears;
    }

    public void setWorkExperienceInYears(int workExperienceInYears) {
        this.workExperienceInYears = workExperienceInYears;
    }


    @Override
    public String toString() {
        return "Driver{" + getFullName() +
                " , лицензия - " + getDrivingLicence() +
                " , стаж работы - " + getWorkExperienceInYears() +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return drivingLicence == driver.drivingLicence && workExperienceInYears == driver.workExperienceInYears && Objects.equals(fullName, driver.fullName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, drivingLicence, workExperienceInYears);
    }

    public abstract void startMove();
    public abstract void finishMove();
    public abstract void refill();

    public static class FullName {
        private String surname;
        private String name;
        private String patronymic;

        public FullName(String surname,
                        String name,
                        String patronymic) {
            this.surname = surname;
            this.name = name;
            this.patronymic = patronymic;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPatronymic() {
            return patronymic;
        }

        public void setPatronymic(String patronymic) {
            this.patronymic = patronymic;
        }

        @Override
        public String toString() {
            return "ФИО: " +
                    surname + " " +
                    name + " " +
                    patronymic;
        }

    }
}
