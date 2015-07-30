package journeys.withinZoneB;

import charges.CapZoneB;
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
}
