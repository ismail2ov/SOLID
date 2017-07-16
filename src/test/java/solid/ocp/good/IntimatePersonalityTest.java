package solid.ocp.good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntimatePersonalityTest {
    @Test
    public void testGreetsSomeoneIntimately() {
        IntimatePersonality ip = new IntimatePersonality();
        assertEquals("Hello Darling!", ip.greet());
    }
}
