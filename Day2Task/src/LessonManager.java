
public class LessonManager {
	public void add(int id, String name, String description, double progress) {
		System.out.println("Ders Eklendi: "+ name);
		System.out.println("Ders Açıklaması: "+ description);
	}
	
	public void delete(int id) {
		System.out.println("Ders Silindi");
	}
}
