package demeterlaw.good;

public class AddressImpl implements Address {

    private String name;
    private String zipCode;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getZipCode() {
        return zipCode;
    }
}
