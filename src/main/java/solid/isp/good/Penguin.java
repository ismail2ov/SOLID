package solid.isp.good;

public class Penguin implements SwimmingCreature, CreatureThatFeeds {
    String currentLocation;

    public void swim() {
        this.currentLocation = "in the water";
    }

    public void eat() {
        System.out.println("The penguin is eating");
    }
}
