# main.py

from tv_tuner import TVWithTuner

if __name__ == "__main__":
    # Створюємо об'єкт телевізора з тюнером
    my_tv = TVWithTuner("Samsung", "QLED", 55, "Цифровий")

    # Вмикаємо телевізор і налаштовуємо тюнер
    my_tv.power()
    my_tv.power_tuner()

    # Перемикаємо канал на телевізорі
    my_tv.change_channel(5)
    my_tv.tune_channel(10)  # Налаштовуємо тюнер на канал 10

    # Вимикаємо телевізор і тюнер
    my_tv.power_tuner()
    my_tv.power()
