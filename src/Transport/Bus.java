package Transport;

public class Bus<T extends Driver_Category_D> extends Transport implements Competing {
    private final T driver;
    private final BusCapacity busCapacity;
    private final Type type;

    public Bus(String brand, String model, double engineVolume, T driver, BusCapacity busCapacity, Type type) {
        setBrand(defaultBrandOrModel(brand));
        setModel(defaultBrandOrModel(model));
        setEngineVolume(defaultEngineVolume(engineVolume));
        this.driver = driver;
        this.busCapacity = busCapacity;
        this.type = type;
    }
    @Override
    public String toString() {
        return
                "Transport{" + "Bus{" +
                        "type='" + type + '\'' +
                        ", brand='" + getBrand() + '\'' +
                        ", model='" + getModel() + '\'' +
                        ", engineVolume=" + getEngineVolume() +
                        ", busCapacity=" + busCapacity +
                        ", driver=" + driver +
                        "}}";
    }
    @Override
    public void startMovement() {
        System.out.println("Автобус начинает движение плавно.");
    }
    @Override
    public void stopMovement() {
        System.out.println("Автобус останавливается плавно.");
    }
    public static String defaultBrandOrModel(String string) {
        if(string == null || string.isEmpty()) {
            return "LIAZ";
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
        System.out.println("Пит-стоп для автобуса " + getModel());
    }

    @Override
    public void bestLapTime() {
        System.out.println("Лучшее время круга для автобуса " + getModel());
    }

    @Override
    public void maximumSpeed() {
        System.out.println("максимальная скорость для автобуса " + getModel());
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
    public void passCarDiagnostics() throws TransportTypeException {
        throw new TransportTypeException("Автобусы не должны проходить диагностику!");
    }
}
