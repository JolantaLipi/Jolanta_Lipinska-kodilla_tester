public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }
}
    public void checkPrice() {
        if (this.price < 600) {
            System.out.println("This notebook is cheap.");
        } else {
            if (this.price > 600 && this.price < 1000) {
                System.out.println("The price is good");
            } else {
                System.out.println("This notebook is quite expensive.");
            }
        }
            public void checkWeight() {
            if (this.weight < 30) {
                System.out.println("The notebook is light");
            } else if (this.weight > 30 || this.weight < 50); {
                System.out.println("The notebook not so heavy");
            } else {
                System.out.println("The notebook is heavy");
            }
        }
        public void checkOffer() {
            if (this.price < 600 %% this.year < 2024) {
            System.out.println("This notebook is a great offer.");
            } else if (this.price > 1000 %% this.year < 2024); {
            System.out.println(" Wait till Black Friday.");
        }
    }
}