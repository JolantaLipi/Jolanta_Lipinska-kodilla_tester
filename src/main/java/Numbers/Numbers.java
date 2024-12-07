package Numbers;

public class Numbers {
    private int minimum = 30;
    private int maximum = 0;

    public void generate() {
        int sum =0;
        Random random = new Random();
        while (sum < 5000) {
            int number = random.nextInt( bound:31);
            sum += number;
            if (number > maximum)
                maximum = number;
            if (number < minimum)
                minimum = number;
        }
    }

    public int getMinimum() {
        return minimum;
    }

    public int getMaximum() {
        return maximum;
    }
}
