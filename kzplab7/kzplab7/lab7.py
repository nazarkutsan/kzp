def create_jagged_alternating_array(size, filler):
    # Ініціалізуємо зубчастий масив
    jagged_array = []

    for i in range(size):
        if i % 2 == 1:
            # Заповнений рядок із символом-заповнювачем
            row = [filler] * size
        else:
            # Порожній рядок
            row = []
        jagged_array.append(row)

    return jagged_array


def display_jagged_array(jagged_array):
    for row in jagged_array:
        print(" ".join(row))


def main():
    try:
        size = int(input("Введіть розмір масиву: "))
        filler = input("Введіть символ-заповнювач: ")

        if len(filler) != 1:
            print("Потрібно ввести лише один символ.")
            return

        jagged_array = create_jagged_alternating_array(size, filler)
        print("Масив:")
        display_jagged_array(jagged_array)

    except ValueError:
        print("Некоректне значення розміру масиву.")


if __name__ == "__main__":
    main()
