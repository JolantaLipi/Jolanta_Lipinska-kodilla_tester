package User;

public static void main(String[] args) {

        User asia = new User("Asia", 20);
        User basia = new User("Basia", 33);
        User czesia = new User("Czesia", 58);
        User danka = new User("Danka", 13);
        User ewa = new User("Ewa", 18);

    User[] users = {asia, basia, czesia, danka, ewa};
    int totalAge = 0;
    for (int i = 0; i < users.length; i++) {
        totalAge += users[i].age;
    }
    double averageAge = (double) totalAge / users.length;
    System.out.println("Average age: " + averageAge);

    for (int i = 0; i < users.length; i++) {
        System.out.println("Users with age below the average:");
        if (users[i].age < averageAge) {
            System.out.println(users[i].name);

        }
    }
}
}