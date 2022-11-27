import java.util.ArrayList;
import java.util.Objects;

public class CourseDatabase {
    private ArrayList<Course> courseList = new ArrayList<Course>();

    CourseDatabase(){}

    public void addCourse(Course newCourse){
        courseList.add(newCourse);
    };

    public void removeCourse(String courseID, int classID){
        courseList.removeIf(c -> Objects.equals(c.getCourseID(), courseID) && c.getClassID() == classID);
    };

    public void removeCourse(Course course){
        courseList.remove(course);
    };

    public ArrayList<Course> searchCourseByID(String courseID){
        courseList.removeIf(c -> !c.getCourseID().equals(courseID));
        return courseList;
    };

    public ArrayList<Course> searchCourseByTeacherName(String teacherName){
        courseList.removeIf(c -> !c.getTeacherName().equals(teacherName));
        return courseList;
    };

    public ArrayList<Course> searchCourseByCourseName(String courseName){
        courseList.removeIf(c -> !c.getCourseName().equals(courseName));
        return courseList;
    };

    public ArrayList<Course> searchCourseByCourseTime(String startTime, String endTime){

        return courseList;
    };

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
}
