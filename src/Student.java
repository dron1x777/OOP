import java.util.Arrays;

public class Student {
    String name;
    int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
    public String calculateAverage() {
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        return name + " has average grade: " + (double) sum / grades.length;
    }
}
