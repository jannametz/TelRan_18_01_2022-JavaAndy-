public class Student {
    String name;
    int[] grades;

    public Student(String name, int[] grades) {
        this.name = name;
        this.grades = grades;
    }
    public double highestGpa  () {
        double result = 0;
        for (int i = 0; i < grades.length; i++) {
            result = result + grades[i];
        }
        return result / grades.length;
    }

    public void print() {
        System.out.print(this.name + " " +  highestGpa());
    }
}