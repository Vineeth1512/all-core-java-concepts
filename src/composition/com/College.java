package composition.com;

import java.util.ArrayList;
import java.util.List;

public class College {
	public static void main(String[] args) {
		Book b1 = new Book("java", "VIneeth");
		Book b2 = new Book("sql", "pavan");
		Book b3 = new Book("Html", "Harsh");
		Book b4 = new Book("javaScript", "Ajith");
		List<Book> obj = new ArrayList<Book>();
		obj.add(b1);
		obj.add(b2);
		obj.add(b3);
		obj.add(b4);
		System.out.println(obj);
		Library library = new Library(obj);
		List<Book> listBooks = library.getAllBooks();
		System.out.println(listBooks);
		for (Book booksss : listBooks) {
			System.out.println(">BoookName< " + booksss.authorName + " >>AuthorName<< " + booksss.authorName);

		}
		listBooks.forEach(x -> System.out.println(x.bookName));
	}

}
