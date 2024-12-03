public class RandomNumbers {
        private List<Integer> numbers;  // Lista przechowująca wylosowane liczby
        private int sum;                // Suma wylosowanych liczb
        private Random random;          // Obiekt do losowania liczb

        // Konstruktor inicjujący listę, sumę i generator liczb losowych
        public RandomNumbers() {
            numbers = new ArrayList<>();
            sum = 0;
            random = new Random();
        }

        // Metoda losująca liczby z zakresu 0-30, aż suma przekroczy 5000
        public void generateNumbers() {
            while (sum <= 5000) {
                int randomNumber = random.nextInt(31);  // Losowanie liczby z zakresu 0-30
                numbers.add(randomNumber);              // Dodanie liczby do listy
                sum += randomNumber;                    // Dodanie liczby do sumy
            }
        }

        // Metoda zwracająca największą wylosowaną wartość
        public int getMaxValue() {
            return numbers.stream().max(Integer::compareTo).orElseThrow(() -> new IllegalStateException("Brak liczb"));
        }

        // Metoda zwracająca najmniejszą wylosowaną wartość
        public int getMinValue() {
            return numbers.stream().min(Integer::compareTo).orElseThrow(() -> new IllegalStateException("Brak liczb"));
        }

        public static void main(String[] args) {
            RandomNumbers randomNumbers = new RandomNumbers();
            randomNumbers.generateNumbers();  // Losowanie liczb
            randomNumbers.printNumbers();     // Wyświetlanie liczb
            randomNumbers.printSum();         // Wyświetlanie sumy

            System.out.println("Największa liczba: " + randomNumbers.getMaxValue());
            System.out.println("Najmniejsza liczba: " + randomNumbers.getMinValue());
        }
    }

}
