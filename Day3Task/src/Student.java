
public class Student extends User {
    private String myCourses;
    private int completed;
    
    public String getMyCourses() {
        return myCourses;
    }

    public void setMyCourses(String myCourses) {
        this.myCourses = myCourses;
    }

    public int getCompleted() {
        return completed;
    }

    public void setCompleted(int completed) {
        this.completed = completed;
    }
}
