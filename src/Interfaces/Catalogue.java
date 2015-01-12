package Interfaces;
import Classes.LibraryBook;

/**
 * Created by digibrose on 12/01/2015.
 * The catalogue for the library will be a list of books shamelessly lifted from cw3 :-)
 */
public interface Catalogue {

    /**
     *  returns a book at the given index
     *
     *  @param index the catalogue number of the book
     *  @return the book
     */

    public String get(int index);

    /**
     * adds a new book to the catalogue
     *
     * @param book
     *
     */

    public void add(LibraryBook book);

    /**
     * removes a book from the catalogue by title
     *
     *
     * @param book
     */

    public void remove(LibraryBook book);

    /**
     * removes a book from the catalogue by catalogue number
     *
     * @param index
     */

    public void remove(int index);



}
