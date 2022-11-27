
import java.util.ArrayList;

public class Student {
    private int studentID;
    private ArrayList<Course> curriculum = new ArrayList<Course>();

    private int remainingCredit = 100;

    public int getRemainingCredit() {
        return remainingCredit;
    }

    public int minusRemainingCredit(int credit){
        return this.remainingCredit - credit;
    }
    public int plusRemainingCredit(int credit){
        return this.remainingCredit + credit;
    }

    public Student(int studentID) {
        this.studentID = studentID;
    }

    public boolean selectCourse(Course course, int credit){
        if(this.getCurriculum() != null && (this.getCurriculum().contains(course) || credit > this.getRemainingCredit())){
            return false;
        } else {
            curriculum.add(course);
            this.minusRemainingCredit(credit);
            return true;
        }
    }

    public void dropCourse(Course course){
        this.curriculum.remove(course);
    }

    public ArrayList<Course> getCurriculum() {
        return curriculum;
    }

    public void changeCredit(Course course, int credit){}
}
