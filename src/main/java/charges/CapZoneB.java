package charges;

public class CapZoneB {
    
    private final double charge = 8d;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CapZoneB)) {
            return false;
        }

        CapZoneB that = (CapZoneB) o;

        if (Double.compare(that.charge, charge) != 0) {
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(charge);
        return (int) (temp ^ (temp >>> 32));
    }
}
