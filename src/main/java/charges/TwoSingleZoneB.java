package charges;

public class TwoSingleZoneB {

    private final double charge = 6d;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TwoSingleZoneB)) {
            return false;
        }

        TwoSingleZoneB that = (TwoSingleZoneB) o;

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
