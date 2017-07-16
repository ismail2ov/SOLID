package solid.ocp.good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FormalPersonalityTest {
    @Test
    public void testGreetsSomeoneFormally() {
        FormalPersonality fp = new FormalPersonality();
        assertEquals("Good evening, sir.", fp.greet());
    }
}
