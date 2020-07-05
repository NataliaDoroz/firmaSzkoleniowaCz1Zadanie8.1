public class Company {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher("Jan", "Nowak", 50, 700222, 5000, "prof");
        StudyGroup studyGroup1 = new StudyGroup(teacher1, createStudents());
        System.out.println(studyGroup1);
    }

    private static Student[] createStudents() {
        System.out.println("Tworzę studentów: ");
        Student student1 = new Student("Nana", "Doroz", 26, 940513, 1, 4.2);
        Student student2 = new Student("Ala", "Kot", 29, 910927, 3, 4.6);
        return new Student[]{student1, student2};
    }
}
