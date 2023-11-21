import java.util.List;

public class StudentGroupService {
    private StudentGroup studentGroup;

    public StudentGroup createStudentGroup (List<Student> studentList) {
        return new StudentGroup(studentList);
    }

    public Student createStudent (String firstName, String secondName, String lastName, int studentID) {
        return new Student(firstName, secondName, lastName, studentID);
    }


    public StudentGroup getStudentGroup() {
        return studentGroup;
    }

    public void printStudentGroup(StudentGroup studentGroup) {
        for (Student st: studentGroup) {
            System.out.println(st);
        }
    }

    public StudentGroup deliteStudent (String name, StudentGroup studentGroup) {
        for (Student student: studentGroup) {
            if (student.getFirstName().equals(name)) {
                studentGroup.deliteFromGroup(student);
            }
        }
        return studentGroup;
    }
}
