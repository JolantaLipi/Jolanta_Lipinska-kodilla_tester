public class FirstClass {
    public static void main(String[] args) {
        Notebook notebook = new Notebook(2, 1000, 2024);
        System.out.println(notebook.weight + " " + notebook.price);
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkOffer();

        Notebook heavyNotebook = new Notebook(34, 599,2023);
        System.out.println(heavyNotebook.weight + " " + heavyNotebook.weight);
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkOffer();

        Notebook oldNotebook = new Notebook(51, 100,2005);
        System.out.println(oldNotebook.weight + " " + oldNotebook.weight);
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkOffer();
    }
}
