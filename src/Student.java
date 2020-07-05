public class Student extends Person {
    private int level;
    private double averageGrade;

    public Student(String firstName, String lastName, int age, int id, int level, double averageGrade) {
        super(firstName, lastName, age, id);

        this.level = level;
        this.averageGrade = averageGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "level=" + level +
                ", averageGrade=" + averageGrade +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
