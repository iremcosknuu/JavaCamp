import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lesson  lesson1 = new Lesson(1,"C# Camp","OOP prgramin with C#",96.77);
		Lesson  lesson2 = new Lesson(2,"Java Camp","OOP prgramin with Java",98.65);
		
		Lesson [] lessons = {lesson1,lesson2};
		
		LessonManager lessonManager = new LessonManager();
		for(Lesson lesson:lessons) {
			lessonManager.add(lesson.id, lesson.name, lesson.description, lesson.progress);
		}
		
		Scanner input = new Scanner(System.in);
	
		System.out.println("Silmek istediğiniz dersin id bilgisini giriniz: ");
		int lessonid = input.nextInt();
		
		lessonManager.delete(lessonid);
	}

}
