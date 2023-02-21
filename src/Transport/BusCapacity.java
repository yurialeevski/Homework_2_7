package Transport;

public enum BusCapacity {
    MINI(null, 10),
    SMALL(null, 25),
    MIDI(25, 50),
    LARGE(50, 80),
    VERY_LARGE(80, 120)
    ;
    private Integer capacityFrom;
    private Integer capacityTo;

    BusCapacity(Integer capacityFrom, Integer capacityTo) {
        this.capacityFrom = capacityFrom;
        this.capacityTo = capacityTo;
    }

    @Override
    public String toString() {
        if(capacityFrom == null) {
            return "Вместимость: до " + capacityTo + " мест";
        } else {
            return  "Вместимость: " + capacityFrom + " - " + capacityTo + " мест";
        }
    }
}
