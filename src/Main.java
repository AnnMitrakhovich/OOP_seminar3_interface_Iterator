import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroupController controller = new StudentGroupController();
        Student student1 = controller.createStudent("Иванов", "Мария", "Петрович", 1124);
        Student student2 = controller.createStudent("Васильева", "Инна", "Александровна", 1728);
        Student student3 = controller.createStudent("Федулова", "Ирина", "Вдадимировна", 1002);
        Student student4 = controller.createStudent("Кондратенко", "Иван", "Петрович", 1439);
        List<Student> studentList1 = new ArrayList<>(List.of(new Student[]{student1, student2, student3, student4}));
        StudentGroup sg1 = controller.createStudentGroup(studentList1);
        controller.print(sg1);
        System.out.println("___");
        /*controller.deliteStudent("Федулова", sg1);
        controller.print(sg1);
        System.out.println("___");
        controller.sort(sg1);
        controller.print(sg1);
        System.out.println("___");
        controller.sortByName(sg1);
        controller.print(sg1);*/
        Student student5 = controller.createStudent("Петрова", "Мария", "Петровна", 1004);
        Student student6 = controller.createStudent("Васильев", "Андрей", "Александрович", 1028);
        Student student7 = controller.createStudent("Федорова", "Анна", "Яновна", 1012);
        Student student8 = controller.createStudent("Иванов", "Иван", "Петровна", 1409);
        List<Student> studentList2 = new ArrayList<>(List.of(new Student[]{student5, student6, student7, student8}));
        StudentGroup sg2 = controller.createStudentGroup(studentList2);
        controller.print(sg2);
        Stream stream1 = controller.createStStream();
        controller.addStudentGroupToStream(stream1, sg1);
        controller.addStudentGroupToStream(stream1, sg2);
        controller.printSteam(stream1);
        Stream stream2 = controller.createStStream();
        controller.printSteam(stream2);
        List<Stream> streamList = controller.createStreamList(stream1);
        controller.addToStreamList(streamList, stream1);
        controller.addToStreamList(streamList, stream2);
        controller.sortStreams(streamList);
        System.out.println(streamList);

    }

    /* как работает Итератор:
    public static void testIterator (StudentGroup studentGroup) {
        StudentGroupIterator sg = new StudentGroupIterator(studentGroup);
        while (sg.hasNext()) {
            System.out.println(sg.next());
        }
    } */
}