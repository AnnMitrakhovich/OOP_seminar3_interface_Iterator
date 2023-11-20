import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private int counter;
    private List<Student> studentList;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
        counter = -1;
    }

    //проверка, чтобы обойти весь список
    @Override
    public boolean hasNext() {
        return counter < studentList.size() - 1;
    }

    //если hasNext вернуло false, то надо получить следующего сдудента из списка
    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        } else {
            counter++;
        }
        return studentList.get(counter);
    }

    @Override
    public void remove() {
        studentList.remove(counter);
    }
}
