package journeys.withinZoneA;

import charges.SingleZoneA;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SingleJourney {

    @Test
    public void isTwoPoundsFifty() {

        final SingleZoneA expectedCharge = new SingleZoneA();
        final SingleZoneA twoPoundsFifty = new SingleZoneA();

        assertThat("Single journey within Zone A is two pounds fifty.", expectedCharge, is(equalTo(twoPoundsFifty)));
    }
}
