/**
 * Classes are presented to demonstrate the facade pattern.
 */
package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * this is main book storage.
 * responsible for add, remove, get list of books.
 * @author Бобков Илья.
 */
public class Library {

    /**
     * list of books.
     */
    private List<String> books;

    /**
     * constructor for create a new object.
     */
    public Library() {
        this.books = new ArrayList<>();
    }

    /**
     * add book to list.
     * @param nameBook title of book.
     */
    public void addBook(final String nameBook) {
        books.add(nameBook);
    }

    /**
     * remove book from list.
     * @param nameBook title of book.
     */
    public void removeBook(final String nameBook) {
        books.remove(nameBook);
    }

    /**
     * return an unmodified version of the list.
     * @return unmodified version of the list.
     */
    public List<String> getBooks() {
        return Collections.unmodifiableList(books);
    }
}
