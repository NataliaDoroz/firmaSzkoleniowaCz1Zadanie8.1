import java.util.Arrays;

public class StudyGroup {
    private Teacher teacher;
    private Student[] students;

    public StudyGroup(Teacher teacher, Student[] students) {
        this.teacher = teacher;
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "teacher=" + teacher +
                "\n students=" + Arrays.toString(students) +
                '}';
    }
}
