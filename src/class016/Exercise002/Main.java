package class016.Exercise002;

public class Main {

	public static void main(String[] args) {
		Book book = new Book();
		book.title = "Bible";
		book.author = "Jesus";
		book.pages = 550;
		book.price = 0;
		System.out.println(book.title + " - " + book.author + " - " + book.pages + " - $" + book.price);
	}

}
