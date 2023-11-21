import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroupController controller = new StudentGroupController();

        Student student1 = controller.createStudent("Иванов", "Иван", "Петрович", 1024);
        Student student2 = controller.createStudent("Васильев", "Андрей", "Александрович", 1028);
        Student student3 = controller.createStudent("Сидорова", "Анна", "Яновна", 1102);
        Student student4 = controller.createStudent("Иванова", "Мария", "Петровна", 1409);
        List<Student> studentList = new ArrayList<>(List.of(new Student[]{student1, student2, student3, student4}));
        StudentGroup sg1 = controller.createStudentGroup(studentList);
        controller.print(sg1);
        System.out.println("___");
        controller.deliteStudent("Сидорова", sg1);
        controller.print(sg1);

    }

    /* как работает Итератор:
    public static void testIterator (StudentGroup studentGroup) {
        StudentGroupIterator sg = new StudentGroupIterator(studentGroup);
        while (sg.hasNext()) {
            System.out.println(sg.next());
        }
    } */
}