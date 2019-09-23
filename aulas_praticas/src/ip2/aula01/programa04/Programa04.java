package ip2.aula01.programa04;

public class Programa04 {

	public static void main(String[] args) {
		
		Author jose = new Author("Jose da Silva", "jose@ufrpe.br", 'M');
		Author jose2 = new Author("Jose da Silva", "jose@ufrpe.br", 'M');

		Book book = new Book("Meu primeiro Livo", jose, 50, 100);
		Book book2 = new Book("Meu primeiro Livo", jose, 50, 100);
		
		System.out.println("book == book2: " + (book == book2));
		System.out.println("book.equals(book2): " + book.equals(book2));

	}

}
