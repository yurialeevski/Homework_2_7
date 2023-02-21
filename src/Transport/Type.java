package Transport;

public enum Type {
    PASSENGER_CAR("Легковые автомобили"),
    TRUCK("Грузовые автомобили"),
    BUS("Автобусы")
    ;
    private String transportType;

    Type(String transportType) {
        this.transportType = transportType;
    }

    public String getTransportType() {
        return transportType;
    }
}
