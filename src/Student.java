public class Student {
    private String firstName;
    private String secondName;
    private String lastName;
    private int studentId;

    public Student(String firstName, String secondName, String lastName, int studentId) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Фамилия ='" + firstName + '\'' +
                ", Имя ='" + secondName + '\'' +
                ", Отчетство ='" + lastName + '\'' +
                ", Студенческий номер =" + studentId +
                '}';
    }
}
