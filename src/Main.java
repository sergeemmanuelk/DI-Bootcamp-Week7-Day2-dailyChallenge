public class Main {
    public static void main(String[] args) {
        Author author = new Author("Serge KONAN", "serge.konan@example.com", 'm');
        Book book = new Book("Mastering Java", author, 29.99, 200);

        System.out.println(book.toString());

    }
}