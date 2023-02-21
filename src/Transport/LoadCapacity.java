package Transport;

public enum LoadCapacity {
    N1(null, 3.5F),
    N2(3.6F, 12.0F),
    N3(12.1F, null)
    ;
    private Float lowerBound;
    private Float upperBound;

    LoadCapacity(Float lowerBound, Float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    @Override
    public String toString() {
        String printLine;
        String printBoundFrom = " от " + lowerBound + " тонн";
        String printBoundUpTo = " до " + upperBound + " тонн";
        if(lowerBound == null) {
            printLine = "Грузоподъемность:" + printBoundUpTo;
            return printLine;
        } else if(upperBound == null) {
            printLine = "Грузоподъемность:" + printBoundFrom;
            return printLine;
        }
        return "Грузоподъемность:" + printBoundFrom + printBoundUpTo;
    }

    public float getUpperBound() {
        return upperBound;
    }

    public void setUpperBound(float upperBound) {
        this.upperBound = upperBound;
    }

    public float getLowerBound() {
        return lowerBound;
    }

    public void setLowerBound(float lowerBound) {
        this.lowerBound = lowerBound;
    }
}
