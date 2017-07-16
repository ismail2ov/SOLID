package solid.dip.good;

import static org.junit.Assert.*;

import org.junit.Test;

public class EBookReaderTest {

	@Test
	public void testReadPdfBook() {
		EBookReader reader = new EBookReader(new PDFBook());
		assertEquals("Reading a PDF Book...", reader.read());
	}
	
	@Test
	public void testReadMobiBook() {
		EBookReader reader = new EBookReader(new MobiBook());
		assertEquals("Reading a Mobi Book...", reader.read());
	}

	@Test
	public void testReadEpubBook() {
		EBookReader reader = new EBookReader(new EpubBook());
		assertEquals("Reading a Epub Book...", reader.read());
	}

}
