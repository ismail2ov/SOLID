package solid.dip.good;

public class EBookReader {

	private EBook book;
	
	public EBookReader(EBook eBook) {
		this.book = eBook;
	}

	public String read() {
		return book.read();
	}
	
}
