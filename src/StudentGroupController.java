import java.util.List;

public class StudentGroupController {
    StudentGroupService studentGroupService = new StudentGroupService();
    StreamService streamService = new StreamService();

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

    public Stream createStStream() {
        return studentGroupService.createStream();
    }
    public void addStudentGroupToStream(Stream stream, StudentGroup studentGroup) {
        studentGroupService.addStudentGroupToStream(stream, studentGroup);
    }

    public void printSteam(Stream stream) {
        System.out.println(stream);
    }
    public List<Stream> createStreamList(Stream stream) {
        return streamService.createStreamList(stream);
    }
    public List<Stream> addToStreamList(List<Stream> streams, Stream stream) {
        return streamService.addToStreamList(streams, stream);
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}
