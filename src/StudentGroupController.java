import java.util.List;

public class StudentGroupController {
    StudentGroupService studentGroupService = new StudentGroupService();

    public StudentGroup createStudentGroup(List<Student> studentList) {
        return studentGroupService.createStudentGroup(studentList);
    }

    public Student createStudent(String firstName, String secondName, String lastName, int studentID) {
        return studentGroupService.createStudent(firstName, secondName, lastName, studentID);
    }


    public void print(StudentGroup studentGroup) {
        studentGroupService.printStudentGroup(studentGroup);
    }

    public void deliteStudent(String name, StudentGroup studentGroup) {
        studentGroupService.deliteStudent(name, studentGroup);
    }

    public void sort(StudentGroup studentGroup) {
        studentGroupService.sortListOfStudents(studentGroup);
    }
    public void sortByName(StudentGroup studentGroup) {
        studentGroupService.getSortedByFIOStudentGroup(studentGroup);
    }
}
