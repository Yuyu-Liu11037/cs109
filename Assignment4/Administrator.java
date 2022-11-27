import java.util.ArrayList;

public class Administrator {
    private ArrayList<Student> studentList = new ArrayList<Student>();
    private CourseDatabase database = new CourseDatabase();

    public Administrator(){}
    public CourseDatabase getDatabase() {
        return database;
    }

    public void addStudent(Student student){
        studentList.add(student);
    }
    public void addStudent(int studentID){
        Student student = new Student(studentID);
        studentList.add(student);
    }

    public void generateCurriculum() {

    }
}
