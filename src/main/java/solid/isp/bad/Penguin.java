package solid.isp.bad;

public class Penguin implements Bird {
    String currentLocation;

    public void fly() {
        throw new UnsupportedOperationException();
    }

    public void swim() {
        this.currentLocation = "in the water";
    }

    public void eat() {
        System.out.println("The penguin is eating");
    }
}
