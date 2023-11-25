import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream implements Iterable<StudentGroup>{
    private String nameOfStream;
    private List<StudentGroup> studentGroupList;
    static int counter;

    public Stream() {
        this.nameOfStream = "Поток " + String.valueOf(1+counter++);
        this.studentGroupList = new ArrayList<>();
    }

    public String getNameOfStream() {
        return nameOfStream;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public static int getCounter() {
        return counter;
    }

    public void addStudentGroupToStream(StudentGroup studentGroup) {
        studentGroupList.add(studentGroup);
    }

    @Override
    public String toString() {
        return "Потоки {" +
                "Название ='" + nameOfStream + '\'' +
                ", Количество групп =" + (studentGroupList.size()) +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroupList.iterator();
    }

}
