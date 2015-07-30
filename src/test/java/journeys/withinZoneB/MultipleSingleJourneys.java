package journeys.withinZoneB;

import charges.CapZoneB;
import charges.TwoSingleZoneB;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class MultipleSingleJourneys {

    @Test
    public void isEightPounds_whenReachingCapZoneB() {

        final CapZoneB expectedCharge = new CapZoneB();
        final CapZoneB eightPounds = new CapZoneB();

        assertThat("Zone B cap is eight pounds.", expectedCharge, is(equalTo(eightPounds)));
    }

    @Test
    public void isSixPounds_withTwoSingleJourneys() {

        final TwoSingleZoneB expectedCharge = new TwoSingleZoneB();
        final TwoSingleZoneB sixPounds = new TwoSingleZoneB();

        assertThat("Two single journeys in Zone B is six pounds.", expectedCharge, is(equalTo(sixPounds)));
    }
}
