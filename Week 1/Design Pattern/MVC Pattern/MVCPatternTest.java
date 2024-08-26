public class MVCPatternTest {
    public static void main(String[] args) {
        Student student = new Student("John Doe", 1, "A");
        StudentView view = new StudentView();
        StudentController controller = new StudentController(student, view);

        controller.displayStudent();
        controller.updateStudentGrade("B");
        controller.displayStudent();
    }
}