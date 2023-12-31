import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>{
    protected List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> setStudentList(List<Student> studentList) {
        this.studentList = studentList;
        return studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void addToGroup(Student student){
        studentList.add(student);
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(this);
    }
    public void deliteFromGroup(Student student){
        studentList.remove(student);
    }
}
