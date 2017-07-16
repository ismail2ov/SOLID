package solid.srp.bad;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void testBook() {
        ArrayList<String> pages = new ArrayList<String>();
        pages.add("Page 1 content");
        pages.add("Page 2 content");
        pages.add("Page 3 content");
        pages.add("Page 4 content");
        Book book = new Book("Where the Red Fern Grows", "Wilson Rawls", pages);

        assertEquals("Where the Red Fern Grows", book.getTitle());
        assertEquals("Wilson Rawls", book.getAuthor());

        assertEquals(1, book.getCurrentPage());
        book.turnPage();
        assertEquals(2, book.getCurrentPage());
        book.turnPage();
        assertEquals(3, book.getCurrentPage());
        book.turnPage();
        assertEquals(4, book.getCurrentPage());
        book.turnPage();
        assertEquals(4, book.getCurrentPage());

        assertEquals("<div class='page'>Page 4 content</div>", book.printCurrentPage("html"));
        assertEquals("Page 4 content", book.printCurrentPage("plainText"));
    }

}
