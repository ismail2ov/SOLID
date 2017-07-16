package solid.isp.bad;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EagleTest {
    @Test
    public void testItCanFly() {
        Eagle eagle = new Eagle();
        eagle.fly();
        assertEquals("in the air", eagle.currentLocation);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void testItCanSwim() {
        Eagle eagle = new Eagle();
        eagle.swim();
        assertEquals("in the water", eagle.currentLocation);
    }

    @Test
    public void testItEating() {
        Eagle eagle = new Eagle();
        eagle.eat();
    }
}
