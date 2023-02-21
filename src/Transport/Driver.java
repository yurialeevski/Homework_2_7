package Transport;

public abstract class Driver {
    private String fullName;
    private boolean hasDrivingLicense;
    private int drivingExperience;

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", hasDrivingLicense=" + hasDrivingLicense +
                ", drivingExperience=" + drivingExperience +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isHasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public int getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(int drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
    public abstract void startDriving();
    public abstract void stopDriving();
    public abstract void fillFuel();
}
