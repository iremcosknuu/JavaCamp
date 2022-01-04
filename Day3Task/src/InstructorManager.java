
public class InstructorManager extends UserManager{

    public void add(Instructor instructor){ 
        super.add(instructor);
        System.out.println("Instructor atandı");
        System.out.println("Verdiği Kurs : "+instructor.getGivenCourses());
    }
    
}
