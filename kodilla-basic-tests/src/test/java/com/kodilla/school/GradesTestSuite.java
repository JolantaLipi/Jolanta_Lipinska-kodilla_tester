package com.kodilla.school;
import com.kodilla.inheritence.school.Grades;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GradesTestSuite {
    @Test
    public void shouldHaveZeroLenght() {
        Grades grades = new Grades();
        int[] values = grades.getValues();
        assertEquals(0, values.lenght);
    }
    @Test
    public void shouldAddTwoElementsToArray() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);

        int[] values = grades.getValues();
        assertEquals(2, values.length);
        assertEquals(4, values[0]);
        assertEquals(2, values[1]);
    }
    @Test
    public void shouldCalculateAverage() {
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);

        assertEquals(3.66, grades.getAverage(), 0.01);
    }
}
