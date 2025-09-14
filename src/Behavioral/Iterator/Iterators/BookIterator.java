package Behavioral.Iterator.Iterators;

import Behavioral.Iterator.Book;

import java.util.List;

public class BookIterator implements Iterator {
    private List<Book> books;
    int index = 0;
    public BookIterator(List<Book> books){
      this.books = books;
    }

    @Override
    public boolean hasNext() {
        return index < books.size();
    }

    @Override
    public Object next() {
        if(index<books.size()){
            return books.get(index++);
        }
        return null;
    }
}
