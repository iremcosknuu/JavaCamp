
public class Main {

	public static void main(String[] args) {
        Student ogrenci1 = new Student();
        ogrenci1.setFirstName("İrem");
        ogrenci1.setLastName("COŞKUN");
        ogrenci1.setEmail("irem@gmail.com");
        ogrenci1.setPassword("12345");
        ogrenci1.setUserId(1);
        ogrenci1.setMyCourses("Java");
        ogrenci1.setCompleted(51);
        
       StudentManager studentmanager = new StudentManager();
       studentmanager.add(ogrenci1);
       
        Instructor instructor1 = new Instructor();
        instructor1.setFirstName("İlayda");
        instructor1.setLastName("COŞKUN");
        instructor1.setEmail("ilayda@gmail.com");
        instructor1.setPassword("12345");
        instructor1.setUserId(2);
        instructor1.setGivenCourses("Java");
        
        
       InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor1);

	}

}
