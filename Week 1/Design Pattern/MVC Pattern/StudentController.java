public class StudentController {
    private Student student;
    private StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    public void updateStudentGrade(String grade) {
        student.setGrade(grade);
    }

    public void displayStudent() {
        view.displayStudentDetails(student.getName(), student.getId(), student.getGrade());
    }
}