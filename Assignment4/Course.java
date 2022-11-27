import java.util.ArrayList;

public class Course {
    private String teacherName;
    private String courseName;
    private String courseID;
    private int classID;
    private ArrayList<SUSTechTime> timeList;

    private int capacity;

    public Course(String teacherName, String courseName, String courseID, int classID, ArrayList<SUSTechTime> timeList, int capacity){
        this.teacherName = teacherName;
        this.courseName = courseName;
        this.courseID = courseID;
        this.classID = classID;
        this.capacity = capacity;
        this.timeList = timeList;
    }

    public String toString() {
        return "Course{" + this.getCourseID() + " " + this.getCourseName() + "-class " + this.getClassID() + " | " + this.getCapacity() + "}";
    }

    public int getCapacity() {
        return capacity;
    }

    public int getClassID() {
        return classID;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getTeacherName(){
        return teacherName;
    }

    public ArrayList<SUSTechTime> getTimeList() {
        return timeList;
    }

    /*public void addCourseTime(String startTime, String endTime) {
        SUSTechTime courseTime = new SUSTechTime(startTime,endTime);
        timeList.add(courseTime);
    }*/
}
