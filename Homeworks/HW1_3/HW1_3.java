package Homeworks.HW1_3;

public class HW1_3 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setTitle("Остров сокровищ");
        book1.setAuthor("Стивенсон");
        book1.setAvailability(true);

        Book book2 = new Book();
        book2.setTitle("Айвенго");
        book2.setAuthor("Скотт");
        book2.setAvailability(true);

        Book book3 = new Book();
        book3.setTitle("Маленький принц");
        book3.setAuthor("Сент-Экзюпери");
        book3.setAvailability(false);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displayAvailableBooks();
        library.searchByAuthor("Дамблдор");

    }
}
