import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    /* Given two arrays. The first is String[n] students – names of students.
    The second is int[n][] grades – the array of grades for student homework.
    Every row of grades array is one student's grades (grades[k] is the grades of students[k]).
    Note, that each student has a different number of grades.
    You should implement the program that finds and displays the student with
    highest GPA and the score.
    Example:
    {Jack, Nick} { { 3,4,2}, { 5,5,5,4} } -> Nick 4.75 */
        // implement OOP style, should be one array!
        String[] names = {"Jack", "Nick"};
        int[][] grades = {{3, 4, 2}, {5, 5, 5, 4}};
        int k = 1;       // first student name , startet from 1
        double highestGpa = 0;
        Student numK1 = null;
        Student numK2;


        while (k < grades.length) {
            numK1 = new Student(names[k], grades[k]);
            numK2 = new Student(names[k-1],grades[k-1]);

            if (grossteGPA(numK1, numK2) > highestGpa) {
                highestGpa = grossteGPA(numK1, numK2);
            }
            k++;
        }
            k = 0;
            while (k < grades.length) {
                if (highestGpa == numK1.highestGpa()) {
                    numK1.print();
                    break;
                }
                k++;
            }
        }

    public static double grossteGPA (Student numK1, Student numK2) {
        int k = 0;
        double gpa = 0;
        while (k <numK1.grades.length){
            if (numK1.highestGpa() > numK2.highestGpa() && numK1.highestGpa() > gpa) {
                gpa = numK1.highestGpa();
            }
            k++;
        }
        return gpa;
    }
}


