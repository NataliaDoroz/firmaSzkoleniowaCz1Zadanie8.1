public class Teacher extends Person {
    private int salary;
    private String degree;

    public Teacher(String firstName, String lastName, int age, int id, int salary, String degree) {
        super(firstName, lastName, age, id);
        this.salary = salary;
        this.degree = degree;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", degree='" + degree + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}
