package Transport;

public class Driver_Category_C extends Driver {
    public Driver_Category_C(String fullName, boolean hasDrivingLicense, int drivingExperience) {
        setFullName(fullName);
        setHasDrivingLicense(hasDrivingLicense);
        setDrivingExperience(drivingExperience);
    }

    @Override
    public void startDriving() {
        System.out.println("C - кат. водитель " + getFullName() + " начал движение.");
    }

    @Override
    public void stopDriving() {
        System.out.println("C - кат. водитель " + getFullName() + " закончил движение.");
    }

    @Override
    public void fillFuel() {
        System.out.println("C - кат. водитель " + getFullName() + " заправил автомобиль.");
    }
}
