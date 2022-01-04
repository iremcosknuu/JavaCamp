
public class StudentManager extends UserManager{
    public void add(Student student){
        super.add(student);
        System.out.println("Kurs : "+student.getMyCourses());
        System.out.println("%"+student.getCompleted()+" tamamlandı.");
    }
}
