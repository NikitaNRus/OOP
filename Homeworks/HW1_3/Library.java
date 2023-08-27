package Homeworks.HW1_3;
import java.util.ArrayList;

public class Library {
    private ArrayList <Book> catalog = new ArrayList<Book> ();
    // метод добавляет книгу
    public void addBook(Book book){
        this.catalog.add(book);
    }
    // метод удаляет книгу
    public void removeBook(Book book){
        this.catalog.remove(book);
    }
    // метод показывает доступные книги
    public void displayAvailableBooks(){
        for (Book book: catalog){
            if (book.getAvailability() == true){
                book.getInfo();
                System.out.println();
            }
        }
    }
    // метод осуществляет поиск книги по автору
    public void searchByAuthor(String name){
        int count = 0;
        for (Book book: catalog){
            if (book.getAuthor() == name){
                book.getInfo();
                System.out.println();
                count +=1;
            }
        }
        if (count>0){
            System.out.println("Всего найдено: "+ count +" книг/книга");
        }
        else System.out.println("Книг не найдено");
        
    }
}
