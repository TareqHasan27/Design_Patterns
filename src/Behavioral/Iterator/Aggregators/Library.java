package Behavioral.Iterator.Aggregators;

import Behavioral.Iterator.Book;
import Behavioral.Iterator.Iterators.BookIterator;
import Behavioral.Iterator.Iterators.Iterator;

import java.util.List;

public class Library implements Aggregator {
    private List<Book> bookslist;
    public Library(List<Book> books) {
        this.bookslist = books;
    }


    @Override
    public Iterator createIterator() {
        return new BookIterator(bookslist);
    }
}
