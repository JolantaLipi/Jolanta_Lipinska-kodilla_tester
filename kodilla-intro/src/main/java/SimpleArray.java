public class SimpleArray {
    private static SimpleArray simpleArray;
    static String[] animals = new String[] {"fox", "cat", "dog", "chicken", "snake"};
    public static void main(String[] args) {
        System.out.println(simpleArray.animals[3]);
        int numberOfElements = animals.length;
        System.out.println("Moja tablica zawiera" + numberOfElements);
    }
}