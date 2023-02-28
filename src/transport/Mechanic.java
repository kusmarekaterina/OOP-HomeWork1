package transport;

public class Mechanic {
    private String surname;
    private String name;
    private String companyName;

    public Mechanic(String surname, String name, String companyName) {
        this.surname = surname;
        this.name = name;
        this.companyName = companyName;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Mechanic{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }

    public void carryOutMaintenance(Transport <?> auto) {
        System.out.println("Нужно провести техобслуживание " + auto);
    }

    public void fixTheTransport(Transport <?> auto){
        System.out.println("Нужно починить машину " + auto);
    };

}
