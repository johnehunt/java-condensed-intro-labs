import java.util.StringJoiner;

/**
 * Represents a Book with a title, author, publisher and a price.
 */
public class Book {

	private String title;
	private Author author;
	private Publisher publisher;
	private double price;

	public Book(String title, Author author, Publisher publisher, double price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Book.class.getSimpleName() + "[", "]")
				.add("title='" + title + "'")
				.add("author=" + author)
				.add("publisher=" + publisher)
				.add("price=" + price)
				.toString();
	}
}
