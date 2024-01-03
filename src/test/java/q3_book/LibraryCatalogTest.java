package q3_book;

import static org.junit.Assert.*;

import org.junit.Test;

public class LibraryCatalogTest {

	LibraryCatalog libraryCatalog = new LibraryCatalog();
	
    @Test
    public void testAddBook() {
        
        Book book = new Book("Test Book", "Test Author");

        libraryCatalog.addBook(book);

        assertTrue(libraryCatalog.getBooks().contains(book));
        
        Book book1 = new Book("Test Book1", "Test Author1");
        assertFalse(libraryCatalog.getBooks().contains(book1));
    }

    @Test
    public void testBorrowBook() {
        Book book = new Book("Test Book", "Test Author");
        libraryCatalog.addBook(book);

        libraryCatalog.borrowBook("Test Book");

        assertFalse(book.isAvailable());
    }

    @Test
    public void testReturnBook() {
        Book book = new Book("Test Book1", "Test Author");
        libraryCatalog.addBook(book);
        libraryCatalog.borrowBook("Test Book1");

        libraryCatalog.returnBook("Test Book1");

        assertTrue(book.isAvailable());
    }
}
