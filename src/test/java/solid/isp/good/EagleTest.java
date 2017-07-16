package solid.isp.good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EagleTest {
    @Test
    public void testItFliesInTheAir() {
        Eagle eagle = new Eagle();
        eagle.fly();
        assertEquals("in the air", eagle.currentLocation);
    }

    @Test
    public void testItEating() {
        Eagle eagle = new Eagle();
        eagle.eat();
    }
}
