package solid.isp.good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PenguinTest {
    @Test
    public void testItCanSwim() {
        Penguin penguin = new Penguin();
        penguin.swim();
        assertEquals("in the water", penguin.currentLocation);
    }

    @Test
    public void testItEating() {
        Penguin penguin = new Penguin();
        penguin.eat();
    }
}
