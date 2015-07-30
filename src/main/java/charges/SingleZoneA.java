package charges;

public class SingleZoneA {

    private final double charge = 2.5d;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SingleZoneA)) {
            return false;
        }

        SingleZoneA that = (SingleZoneA) o;

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
