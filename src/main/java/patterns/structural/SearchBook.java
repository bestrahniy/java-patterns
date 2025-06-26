package patterns.structural;

/**
 * this is subsystem for search book by name.
 * @author Бобков Илья.
 */
public final class SearchBook {

    private final Library library;

    public SearchBook(final Library librar) {
        this.library = librar;
    }

    /**
     * method searches book in list.
     * @param nameBook title of book.
     * @return title of book, if book constains in list.
     * else - string "Book not found".
     */
    public String search(final String nameBook) {
        if (library.getBooks().contains(nameBook)) {
            return nameBook;
        } else {
            return "Book not found";
        }
    }

}
