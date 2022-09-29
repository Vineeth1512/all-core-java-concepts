package collections.programs.com;

public class Employee {
	private int empId;
	private String name;
	private int age;
	private String address;
	private Department department;

	Employee(int empId,int age, String name, String address, Department department) {
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.address = address;
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;

	}

}
