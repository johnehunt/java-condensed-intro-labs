import java.util.StringJoiner;

/**
 * Represents an Address of something or someone.
 */
public class Address {
	private int number;
	private String street;
	private String city;
	private String county;
	private String postcode;
	
	public Address(int number, String street, String city, String county, String postcode) {
		super();
		this.number = number;
		this.street = street;
		this.city = city;
		this.county = county;
		this.postcode = postcode;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", Address.class.getSimpleName() + "[", "]")
				.add("number=" + number)
				.add("street='" + street + "'")
				.add("city='" + city + "'")
				.add("county='" + county + "'")
				.add("postcode='" + postcode + "'")
				.toString();
	}
}
