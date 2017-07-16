package demeterlaw.good;

public class PersonImpl implements Person {
    private House house;

    @Override
    public void setHouse(House house) {
        this.house = house;
    }

    @Override
    public House getHouse() {
        return house;
    }

    @Override
    public String getZipCode() {
        return house.getZipCode();
    }
}
