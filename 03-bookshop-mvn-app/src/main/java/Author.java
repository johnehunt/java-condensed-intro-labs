import java.util.StringJoiner;

/**
 * Represents an author or creator of something.
 */
public class Author {
	
	private String name;
	private Address address;

	public Author(String name) {
		this.name = name;
	}
	
	public Author(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Author.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.add("address=" + address)
				.toString();
	}
}
