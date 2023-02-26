package Transport;

public class Mechanic {
    private final String nameAndFamilyName;
    private final String mechanicCompany;

    public Mechanic(String nameAndFamilyName, String mechanicCompany) {
        this.nameAndFamilyName = nameAndFamilyName;
        this.mechanicCompany = mechanicCompany;
    }

    @Override
    public String toString() {
        return "\nMechanic{" +
                "nameAndFamilyName='" + nameAndFamilyName + '\'' +
                ", mechanicCompany='" + mechanicCompany + '\'' +
                '}';
    }

    public String getNameAndFamilyName() {
        return nameAndFamilyName;
    }

    public String getMechanicCompany() {
        return mechanicCompany;
    }
    public void performMaintenance(Transport transport) {
        System.out.println("Механик " + getNameAndFamilyName() +
                    " из компании " + getMechanicCompany() +
                    " проводит техобслуживание " + transport.getBrand() + " " + transport.getModel());
    }
    public void repairAutomobile(Transport transport) {
        System.out.println("Механик " + getNameAndFamilyName() +
                " компании " + getMechanicCompany() +
                " ремонтирует автомобиль " + transport.getBrand() + " " + transport.getModel());
    }
}
