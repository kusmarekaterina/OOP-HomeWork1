package transport;

public enum BodyType {
        SEDAN("Седан"),
        HATCHBACK ("Хутчбэк"),
        COUPE ("Купе"),
        UNIVERSAL ("Универсал"),
        SUV ("Внедорожник"),
        CROSSOVER ("Кроссовер"),
        PICKUP ("Пикап"),
        VAN ("Фургон"),
        MINIVAN ("Минивэн");

        private String name;

        BodyType (String name) {
            this.name = name;
        }

        public String getName() {
                return name;
        }

        @Override
        public String toString() {
                return "Тип кузова: " +
                        name;
        }
}
