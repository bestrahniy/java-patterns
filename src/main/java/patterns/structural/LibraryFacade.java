package patterns.structural;

import java.util.List;

/**
 * the main class.
 * provides a simplified interface for client.
 * clients interact only with this interface.
 * @author Бобков Илья.
 */
public class LibraryFacade {

    private Library library;

    private SearchBook searchBook;

    private SetBook setBook;

    public LibraryFacade() {
        this.library = new Library();
        this.searchBook = new SearchBook(library);
        this.setBook = new SetBook(library);
    }

    public List<String> getAllBooks() {
        return library.getBooks();
    }

    /**
     * method searches book by title in subsystem searchBook.
     * @param nameBook title of book.
     * @return name of book, if book found, else - string "Book not found".
     */
    public String bookSearch(final String nameBook) {
        return searchBook.search(nameBook);
    }

    /**
     * client can borrow book from subsystem library and this book will remove.
     * else - string "Book not found".
     * @param nameBook tite of book.
     * @return book, if book found, else - string "Book not found".
     */
    public String receiveBook(final String nameBook) {
        return setBook.receive(nameBook);
    }

    /**
     * return book to library.
     * method adds book to list of books in subsystem library.
     * @param nameBook title of book.
     */
    public void returnBook(final String nameBook) {
        library.addBook(nameBook);
        System.out.println("Book are returned in library");
    }

}
