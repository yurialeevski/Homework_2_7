package Transport;

public class Truck<T extends Driver_Category_C> extends Transport implements Competing {
    private final T driver;
    private final LoadCapacity loadCapacity;
    private final Type type;
    public Truck(String brand, String model, double engineVolume, T driver, LoadCapacity loadCapacity, Type type) {
        setBrand(defaultBrandOrModel(brand));
        setModel(defaultBrandOrModel(model));
        setEngineVolume(defaultEngineVolume(engineVolume));
        this.driver = driver;
        this.loadCapacity = loadCapacity;
        this.type = type;
    }
    @Override
    public String toString() {
        return "Transport{" + "Truck{" +
                "type='" + type + '\'' +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", engineVolume=" + getEngineVolume() +
                ", loadCapacity=" + loadCapacity +
                ", driver=" + driver +
                "}}";
    }
    @Override
    public void startMovement() {
        System.out.println("Грузовой автомобиль начинает движение медленно.");
    }
    @Override
    public void stopMovement() {
        System.out.println("Грузовой автомобиль тормозит медленно.");
    }
    public static String defaultBrandOrModel(String string) {
        if(string == null || string.isEmpty()) {
            return "KAMAZ";
        }
        return string;
    }
    public static double defaultEngineVolume(double engineVolume) {
        if(engineVolume <= 0.0 || engineVolume > 14.0 ) {
            return 4.0;
        }
        return engineVolume;
    }
    @Override
    public void pit_stop() {
        System.out.println("Пит-стоп для грузовика " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга для грузовика " + getModel());
    }

    @Override
    public void maximumSpeed() {
        System.out.println("максимальная скорость для грузовика " + getModel());
    }
    @Override
    public String getType() {
        return type.getTransportType();
    }
    @Override
    public void printType() {
        if(type != null) {
            System.out.println(getType());
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
    @Override
    public void passCarDiagnostics() {
        System.out.println("Грузовой автомобиль " + getBrand() + " " + getModel() + " проходит диагностику.");
    }
}
