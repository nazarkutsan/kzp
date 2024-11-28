package KI306.Kutsan.Lab6;

import java.util.ArrayList;

// Клас Book для демонстрації роботи з поличкою
class Book implements Comparable<Book> {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public int compareTo(Book other) {
        return Integer.compare(this.pages, other.pages);
    }

    @Override
    public String toString() {
        return "Книга: " + title + ", сторінок: " + pages;
    }
}

// Програма-драйвер для тестування класу Shelf
public class Main {
    public static void main(String[] args) {
        Shelf<Book> bookShelf = new Shelf<>();

        // Додаємо книги на поличку
        bookShelf.addItem(new Book("Програмування на Java", 500));
        bookShelf.addItem(new Book("Алгоритми та структури даних", 300));
        bookShelf.addItem(new Book("Мережеві технології", 450));

        // Знаходимо та виводимо книгу з максимальною кількістю сторінок
        Book maxBook = bookShelf.findMax();
        System.out.println("Книга з максимальною кількістю сторінок: " + maxBook);
    }
}
