import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Иванов", "Иван", "Петрович", 1024);
        Student student2 = new Student("Васильев", "Андрей", "Александрович", 1028);
        Student student3 = new Student("Сидорова", "Анна", "Яновна", 1102);
        Student student4 = new Student("Иванова", "Мария", "Петровна", 1409);
        List<Student> studentList = List.of(new Student[]{student1, student2, student3, student4});
        StudentGroup studentGroup = new StudentGroup(studentList);
        testIterator(studentGroup);




    }
    public static void testIterator (StudentGroup studentGroup) {
        StudentGroupIterator sg = new StudentGroupIterator(studentGroup);
        while (sg.hasNext()) {
            System.out.println(sg.next());
        }
    }
}