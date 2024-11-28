import struct
import math
import sys


# Функція для обчислення виразу y = cos(x) / tan(2x)
def calculate(x):
    try:
        result = math.cos(x) / math.tan(2 * x)
        return round(result, 5)  # Округлюємо результат до 5 знаків після коми
    except ZeroDivisionError:
        print("Помилка: ділення на нуль.")
        return None


# Запис результату у текстовий файл
def write_to_text_file(filename, result):
    try:
        with open(filename, 'w') as f:
            f.write(f"{result:.5f}")  # Записуємо результат з 5 знаками після коми
    except IOError as e:
        print(f"Помилка запису в текстовий файл: {e}")


# Читання результату з текстового файлу
def read_from_text_file(filename):
    try:
        with open(filename, 'r') as f:
            result = float(f.read())
            return result
    except FileNotFoundError:
        print(f"Файл {filename} не знайдено.")
        return None
    except ValueError:
        print("Помилка: невірний формат даних у текстовому файлі.")
        return None


# Запис результату у двійковий файл
def write_to_binary_file(filename, result):
    try:
        with open(filename, 'wb') as f:
            f.write(struct.pack('f', round(result, 5)))  # Округлюємо до 5 знаків перед записом
    except IOError as e:
        print(f"Помилка запису в двійковий файл: {e}")


# Читання результату з двійкового файлу
def read_from_binary_file(filename):
    try:
        with open(filename, 'rb') as f:
            result = struct.unpack('f', f.read())[0]
            return result
    except FileNotFoundError:
        print(f"Файл {filename} не знайдено.")
        return None
    except struct.error:
        print("Помилка: невірний формат даних у двійковому файлі.")
        return None


# Основна частина програми
if __name__ == "__main__":
    try:
        x = float(input("Введіть значення x: "))
        result = calculate(x)

        if result is not None:
            # Запис результату у текстовий і двійковий файли
            write_to_text_file("result.txt", result)
            write_to_binary_file("result.bin", result)

            # Читання і вивід результатів з файлів
            text_result = read_from_text_file("result.txt")
            binary_result = read_from_binary_file("result.bin")

            if text_result is not None:
                print(f"Результат з текстового файлу: {text_result:.5f}")
            if binary_result is not None:
                print(f"Результат з двійкового файлу: {binary_result:.5f}")

    except ValueError:
        print("Помилка: введено некоректне значення x.")
        sys.exit(1)
