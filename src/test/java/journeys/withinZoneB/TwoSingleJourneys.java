package journeys.withinZoneB;

import charges.TwoSingleZoneB;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TwoSingleJourneys {

    @Test
    public void isSixPounds() {
        
        final TwoSingleZoneB expectedCharge = new TwoSingleZoneB();
        final TwoSingleZoneB sixPounds = new TwoSingleZoneB();

        assertThat("Two single journeys in Zone B is six pounds.", expectedCharge, is(equalTo(sixPounds)));
    }
}
