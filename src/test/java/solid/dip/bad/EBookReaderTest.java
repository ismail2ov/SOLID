package solid.dip.bad;

import static org.junit.Assert.*;

import org.junit.Test;

public class EBookReaderTest {

	@Test
	public void testReadPdfBook() {
		EBookReader reader = new EBookReader(new PDFBook());
		assertEquals("Reading a PDF Book...", reader.read());
	}

}
