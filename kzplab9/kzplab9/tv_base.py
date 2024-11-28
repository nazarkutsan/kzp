# tv_base.py

class TV:
    def __init__(self, brand, model, screen_size):
        self.brand = brand             # Марка телевізора
        self.model = model             # Модель телевізора
        self.screen_size = screen_size # Розмір екрану в дюймах
        self.is_on = False             # Стан телевізора (вимкнений за замовчуванням)
        self.current_channel = 1       # Поточний канал

    def power(self):
        """Вмикає або вимикає телевізор."""
        self.is_on = not self.is_on
        state = "увімкнено" if self.is_on else "вимкнено"
        print(f"Телевізор {self.brand} {self.model} {state}.")

    def change_channel(self, channel):
        """Змінює канал телевізора."""
        if self.is_on:
            self.current_channel = channel
            print(f"Перемкнуто на канал {self.current_channel}.")
        else:
            print("Спочатку увімкніть телевізор.")
