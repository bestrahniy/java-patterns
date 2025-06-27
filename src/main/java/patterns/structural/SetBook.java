package patterns.structural;

/**
 * this is subsystem to borrow book by name.
 * @author Бобков Илья.
 */
public class SetBook {

    private final Library library;

    public SetBook(final Library librar) {
        this.library = librar;
    }

    /**
     * allows client to borrow book.
     * calls method from library to remove book from list.
     * @param nameBook title of book.
     * @return name book, if book contains in list.
     * else - string "Book not found".
     */
    public String receive(final String nameBook) {
        if (library.getBooks().contains(nameBook)) {
            library.removeBook(nameBook);
            return nameBook;
        } else {
            return "Book not found";
        }
    }

}
