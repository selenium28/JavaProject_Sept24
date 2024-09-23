package encap;

public class Encapsulation {

	private int mob;  // store mob no
	private String empID ;
	private double salary ;
	
	public int getMob() {
		return mob;
	}

	public void setMob(int m) {
		mob = m;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Encapsulation obj = new Encapsulation();
		obj.setMob(987654321);
		obj.setEmpID("DS123");
		obj.setSalary(50000);
		
		System.out.println("Mob: " +obj.getMob());
		System.out.println("EmpID: " +obj.getEmpID());
		
		

	}

}
