// polymorphism: each class that inherits it can implement it their own way
public abstract class employeeParent {
	
	private String firstName;
	private String lastName;
	private double pay;
	private String address;
	private String reportsTo;
	
	public employeeParent (String firstName, String lastName, double pay) {
		this.firstName=firstName;
		this.lastName = lastName;
		this.pay = pay;
	}	
	
public abstract double calculatePay();		// the ; makes it polymorphic.
	

public String getInformation() {
	return "Name: " + firstName + "" + lastName
			+"\nReports to: " + reportsTo
			+ "\nAddress: ";
}


public String getFirstName() {
	return firstName;
}


public void setFirstName(String firstName) {
	this.firstName = firstName;
}


public String getLastName() {
	return lastName;
}


public void setLastName(String lastName) {
	this.lastName = lastName;
}


public double getPay() {
	return pay;
}


public void setPay(double pay) {
	this.pay = pay;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}


public String getReportsTo() {
	return reportsTo;
}


public void setReportsTo(String reportsTo) {
	this.reportsTo = reportsTo;
}

public double calculatePay1() {
	// TODO Auto-generated method stub
	return 0;
}
}
