package solid.srp.good;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HtmlPrinterTest {

    @Test
    public void testPrint() {
        Printer printer = new HtmlPrinter();
        assertEquals("<div class='page'>A page to be printed in HTML</div>", printer.printPage("A page to be printed in HTML"));
    }

}
