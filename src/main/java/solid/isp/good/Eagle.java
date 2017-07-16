package solid.isp.good;

public class Eagle implements FlyingCreature, CreatureThatFeeds {
    String currentLocation;

    public void fly() {
        this.currentLocation = "in the air";
    }

    public void eat() {
        System.out.println("The eagle is eating");
    }
}
