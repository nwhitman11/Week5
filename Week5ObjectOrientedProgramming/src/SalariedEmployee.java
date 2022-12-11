//// "extends:"  What is this class going to extend?  The EmployeeParent Class.
public class SalariedEmployee extends employeeParent {

	
	public SalariedEmployee(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay); //super = instnace of class we are inheriting from
	}
	
	@Override
	public double calculatePay() {
		return this.getPay() * 80; // getPay comes from employeeParent class
	} 

}
