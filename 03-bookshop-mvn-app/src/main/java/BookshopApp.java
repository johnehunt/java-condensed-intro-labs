public class BookshopApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Java Bookshop");
        System.out.println("============================");

        Address authorAddress = new Address(10, "High Street",
                "Any Town", "Somerset",
                "SA1 23Z");
        Author author = new Author("Pete Smith", authorAddress);

        System.out.println("Author: " + author);

        Address publisherAddress = new Address(1, "Main Street",
                "Some City", "Kent",
                "KA1 43A");
        Publisher publisher =
                new Publisher("Tech Books Publishing Ltd.",
                        publisherAddress);

        System.out.println("Publisher: " + publisher);

        Book book = new Book("Java Unleashed",
                author, publisher, 15.95);
        System.out.println("Book: " + book);


    }

}
