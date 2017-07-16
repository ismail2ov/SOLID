package solid.srp.good;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void before() {
        ArrayList<String> pages = new ArrayList<String>();
        pages.add("Page 1 content");
        pages.add("Page 2 content");
        pages.add("Page 3 content");
        pages.add("Page 4 content");
        book = new Book("Where the Red Fern Grows", "Wilson Rawls", pages);
    }

    @Test
    public void testGetTitle() {
        assertEquals("Where the Red Fern Grows", book.getTitle());
    }

    @Test
    public void testGetAuthor() {
        assertEquals("Wilson Rawls", book.getAuthor());
    }

    @Test
    public void testGetCurrentPageDoesNotGoPastLastPage() {
        book.turnPage(); // now on page 2
        book.turnPage(); // now on page 3
        book.turnPage(); // now on page 4
        book.turnPage(); // still on page 4
        assertEquals(4, book.getCurrentPage());
    }

}
