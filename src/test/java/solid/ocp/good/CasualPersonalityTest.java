package solid.ocp.good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CasualPersonalityTest {
    @Test
    public void testGreetsSomeoneCasually() {
        CasualPersonality cp = new CasualPersonality();
        assertEquals("Sup bro?", cp.greet());
    }
}
