
public class Classes {
//Use student.java for this file!!
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Student student1 = new Student();
student1.firstName = "Tom";
student1.lastName = "Smith";
student1.gradeLevel = 12;
student1.phoneNumber = "480-123-4567";

student1.introduce();

Student student2= new Student("Sammy", "Jones");
student2.introduce();

Student student3 = new Student("Tom", "Riddle", "429.575.5407", 11);
student3.introduce();
	}

}
