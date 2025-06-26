package patterns.structural;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    private LibraryFacade libraryFacade;

    @BeforeEach
    void init(){
        libraryFacade = new LibraryFacade();
        libraryFacade.returnBook("Война и мир");
        libraryFacade.returnBook("Евгений Онегин");
        libraryFacade.returnBook("Преступление и наказание");
    }

    @Test
    void returnBookTest(){
        libraryFacade.returnBook("Капитанская дочка");
        assertTrue(libraryFacade.getAllBooks().contains("Капитанская дочка"));
    }

    @Test
    void searchBookTest(){
        assertEquals("Война и мир", libraryFacade.bookSearch("Война и мир"));
    }

    @Test
    void borrowBook(){
        libraryFacade.receiveBook("Война и мир");
        assertFalse(libraryFacade.getAllBooks().contains("Война и мир"));
    }

}
