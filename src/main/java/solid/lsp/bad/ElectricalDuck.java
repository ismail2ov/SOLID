package solid.lsp.bad;

public class ElectricalDuck extends DuckImpl {

    private boolean isPowerOn;

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public void turnPowerOn() {
        isPowerOn = true;
    }


    @Override
    public void swim() {
        if (!this.isPowerOn) {
            turnPowerOn();
        }
        System.out.println("The electrical duck is swimming");
    }
}
