package Homeworks.HW1_3;

public class Book {
    private String title;
    private String author;
    private Boolean available;
    /**
     * @param title Название книги
     * @param author Автор книги
     * @param available Доступность книги
     */
    // Сеттер для названия 
    public void setTitle(String title){
        this.title = title;
    }

    // Сеттер для автора 
    public void setAuthor(String author){
        this.author = author;
    }
    // Сеттер для доступности 
    public void setAvailability(Boolean available){
        this.available = available;
    }
    // Геттер для названия
    public String getTitle (){
        return title;
    }

    // Геттер для автора 
    public String getAuthor (){
        return author;
    }

    // Геттер для доступности
    public Boolean getAvailability (){
        return available;
    }

    // получение информации о книге
    public void getInfo(){
        System.out.printf("Автор: %s, Название: %s, Доступность: %b", author, title, available);
    }

}


