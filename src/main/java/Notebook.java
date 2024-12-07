public class Notebook {
        int weight;
        int price;
        int year;

        public Notebook(int weight, int price, int year) {
            this.weight = weight;
            this.price = price;
            this.year = year;
        }

        public void checkPrice() {
            if (this.price < 600) {
                System.out.println("This notebook is cheap.");
            } else if (this.price < 1000)
                System.out.println("The price is good.");
        } else {
                System.out.println("This notebook is expensive.");
            }
    }
    public void checkDevice() {
    String suffix = null;
    if (year < 2020) {
        suffix = "quite old";
    } else {
        suffix = "new";
    }
    String prefix = null;
    if (price < 2000) {
        prefix = "cheap";
    } else if (price < 3000) {
        prefix = "in good price";
    } else {
        prefix = "expensive";
        System.out.println("This notebook is " + prefix + "and " + suffix);
    }
}
