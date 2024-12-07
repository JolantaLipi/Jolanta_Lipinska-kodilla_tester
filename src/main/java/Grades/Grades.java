package Grades;

public class Grades {
    private int[] grades = new int[10];
    private int size = 0;

    public void addGrade(int grade) {
        grades.[size] = grade;
        size++;
    }

    public int getLastGrade() {
        return grades[size - 1];
    }

    public double getAverage() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return sum / size;
    }
}
