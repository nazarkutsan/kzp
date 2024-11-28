package KI306.Kutsan.Lab6;

import java.util.ArrayList; /**
 * Параметризований клас Shelf, який представляє поличку з предметами.
 * @param <T> Тип об'єктів, що будуть зберігатися на поличці.
 */
public class Shelf<T extends Comparable<T>> {
    private ArrayList<T> items;

    public Shelf() {
        items = new ArrayList<>();
    }

    /**
     * Додає предмет на поличку.
     * @param item Предмет для додавання.
     */
    public void addItem(T item) {
        items.add(item);
        System.out.println("Додано предмет: " + item);
    }

    /**
     * Видаляє предмет з полички за індексом.
     * @param index Індекс предмета для видалення.
     */
    public void removeItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
            System.out.println("Видалено предмет на індексі: " + index);
        } else {
            System.out.println("Невірний індекс.");
        }
    }

    /**
     * Повертає максимальний елемент на поличці.
     * @return Максимальний предмет.
     */
    public T findMax() {
        if (items.isEmpty()) return null;
        T max = items.get(0);
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;
    }

    /**
     * Отримує предмет з полички за індексом.
     * @param index Індекс предмета.
     * @return Предмет на заданому індексі або null, якщо індекс недійсний.
     */
    public T getItem(int index) {
        return (index >= 0 && index < items.size()) ? items.get(index) : null;
    }
}
