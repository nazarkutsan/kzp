# tv_tuner.py

from tv_base import TV

class TVWithTuner(TV):
    def __init__(self, brand, model, screen_size, tuner_type):
        super().__init__(brand, model, screen_size)
        self.tuner_type = tuner_type   # Тип тюнера (аналоговий чи цифровий)
        self.is_tuner_on = False       # Стан тюнера

    def power_tuner(self):
        """Вмикає або вимикає тюнер."""
        if self.is_on:
            self.is_tuner_on = not self.is_tuner_on
            state = "увімкнено" if self.is_tuner_on else "вимкнено"
            print(f"Тюнер {self.tuner_type} {state}.")
        else:
            print("Спочатку увімкніть телевізор.")

    def tune_channel(self, channel):
        """Налаштовує тюнер на канал."""
        if self.is_on and self.is_tuner_on:
            self.change_channel(channel)
            print(f"Тюнер налаштовано на канал {channel}.")
        elif not self.is_on:
            print("Спочатку увімкніть телевізор.")
        elif not self.is_tuner_on:
            print("Спочатку увімкніть тюнер.")
