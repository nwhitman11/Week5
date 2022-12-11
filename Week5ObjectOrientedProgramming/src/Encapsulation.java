
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student student = new Student();
		student.setFirstName = ("Sally");
		student.setPhoneNumber("1236546545");
		student.introduce();
		
		Rectangle rec = new Rectangle (10.0, 15.0);
		rec.setLength(10.0);
		System.out.println(rec.getArea());
		
				/*
				 * Access Modifiers:
				 * 	Public:
				 * 		Accessible everywhere.  
				 * 	Private:
				 * 		Only accessible within the class itself
				 * 	Protected:
				 * 		Only accessible within the class, other classes in the same package, and all subclasses
				 * 	No Modifier:
				 * 		Same as protected except that it is not accessible in subclasses in a different package.
				 */
	}

}
