import java.util.StringJoiner;

/**
 * Represents organisations that publish things,
 * such as books, or music etc.
 */
public class Publisher {

	private String name;
	private Address address;

	public Publisher(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Publisher.class.getSimpleName() + "[", "]")
				.add("name='" + name + "'")
				.add("address=" + address)
				.toString();
	}
}
