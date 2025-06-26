/**
 * Classes are presented to demonstrate the facade pattern.
 */
package org.example;

import java.util.List;

/**
 * the main class.
 * provides a simplified interface for client.
 * clients interact only with this interface.
 * @author Бобков Илья.
 */
public class LibraryFacade {

    /**
     * link to library.
     */
    private Library library;

    /**
     * link to subsystem for search books.
     */
    private SearchBook searchBook;

    /**
     * link to subsystem for borrow books.
     */
    private SetBook setBook;

    /**
     * constructor for crating a new object.
     */
    public LibraryFacade() {
        this.library = new Library();
        this.searchBook = new SearchBook(library);
        this.setBook = new SetBook(library);
    }

    /**
     * return list with all books.
     * @return list of books.
     */
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
