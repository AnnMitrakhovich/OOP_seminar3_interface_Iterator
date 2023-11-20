import java.util.List;

public class StudentGroup {
    private List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addToGroup(Student student){
        studentList.add(student);
    };
}
