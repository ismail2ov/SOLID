package demeterlaw.good;

public class HouseImpl implements House {

    private Address address;

    @Override
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Address getAddress() {
        return address;
    }

    @Override
    public String getZipCode() {
        return address.getZipCode();
    }
}
