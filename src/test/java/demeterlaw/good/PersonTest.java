package demeterlaw.good;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testPersonZipCode() {
        Address address = new AddressImpl();
        address.setName("01");
        address.setZipCode("08005");

        House house = new HouseImpl();
        house.setAddress(address);

        Person person = new PersonImpl();
        person.setHouse(house);

        String personZipCode = person.getZipCode();
        assertNotNull(personZipCode);
    }

}