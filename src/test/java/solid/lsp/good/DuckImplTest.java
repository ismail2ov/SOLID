package solid.lsp.good;

import org.junit.Before;
import org.junit.Test;

public class DuckImplTest {
    private WildDuck wildDuck;
    private ElectricalDuck electricalDuck;

    @Before
    public void setUp() throws Exception {
        wildDuck = new WildDuck();
        electricalDuck = new ElectricalDuck();
    }

    @Test
    public void theDuckCanSayQuack() throws Exception {
        wildDuck.quack();
        electricalDuck.quack();
    }

    @Test
    public void theDuckCanSwim() throws Exception {
        wildDuck.swim();
        electricalDuck.swim();
    }

}