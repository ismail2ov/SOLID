package solid.isp.bad;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

public class PenguinTest {
    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test(expected = UnsupportedOperationException.class)
    public void testItCantActuallyFly() {
        Penguin penguin = new Penguin();
        penguin.fly();
    }

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
