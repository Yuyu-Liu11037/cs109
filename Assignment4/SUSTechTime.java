
enum WeekType {Odd, Even, Every}

public class SUSTechTime {
    private String startTime;
    private String endTime;
    private Weekday weekday;
    private WeekType weekType;

    /*SUSTechTime(String startTime, String endTime){
        this.startTime = startTime;
        this.endTime = endTime;
    }*/

    SUSTechTime(String startTime, String endTime, Weekday weekday, WeekType weekType){
        this.startTime = startTime;
        this.endTime = endTime;
        this.weekday = weekday;
        this.weekType = weekType;
    };

    public String toString(){
        return "SUSTechTime{" + startTime + " ~ " + endTime + " | " + weekday + " | " + weekType + " week}";
    }
}
