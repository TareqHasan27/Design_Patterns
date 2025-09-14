import Behavioral.Iterator.Aggregators.Library;
import Behavioral.Iterator.Book;
import Behavioral.Iterator.Iterators.Iterator;

import java.util.Arrays;
import java.util.List;

void main() {
    List<Book> bookslist = Arrays.asList(
            new Book("PHY1", "Tapan"),
            new Book("PHY2" , "Tapan1"),
            new Book("PHY3" , "Tapan2")
    );
    Library library = new Library(bookslist);
    Iterator iterator = library.createIterator();

    while (iterator.hasNext()) {
        Book book = (Book) iterator.next();
        System.out.println(book.getName() + ' ' + book.getTitle());
    }
}
