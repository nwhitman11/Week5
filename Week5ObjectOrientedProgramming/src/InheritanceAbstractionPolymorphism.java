
public class InheritanceAbstractionPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		employeeParent salary = new SalariedEmployee("tom", "Sawyer", 2500.00);
		
		employeeParent hourly = new HourlyEmployee("Tim" , "Smith", 15.00, 75.5);
		employeeParent manager = new Manager("Rob", "Lincoln", 4500.00, 15.5);
		
		System.out.println(salary.calculatePay());
		System.out.println(hourly.calculatePay());
		System.out.println(manager.calculatePay());
	}

}
