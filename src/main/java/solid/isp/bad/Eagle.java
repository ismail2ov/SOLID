package solid.isp.bad;

public class Eagle implements Bird {
    String currentLocation;

    public void fly() {
        this.currentLocation = "in the air";
    }

    public void swim() {
        throw new UnsupportedOperationException();
    }

    public void eat() {
        System.out.println("The eagle is eating");
    }
}
