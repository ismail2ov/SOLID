package solid.srp.good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlainTextPrinterTest {

    @Test
    public void testPrint() {
        Printer printer = new PlainTextPrinter();
        assertEquals("A page to be printed in plain text", printer.printPage("A page to be printed in plain text"));
    }

}
