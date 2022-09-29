package collections.programs.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {

		Department account = new Department("Account", 75);
		Department hr = new Department("HR", 50);
		Department ops = new Department("OP", 25);
		Department tech = new Department("Tech", 150);

		Employee e1 = new Employee(14, 24, "vineeth", "vemulawada", account);
		Employee e2 = new Employee(1, 21, "pavan", "manugonda", account);
		Employee e3 = new Employee(54, 22, "harsh", "palakollu", ops);
		Employee e4 = new Employee(1, 25, "mani", "palakollu", tech);
		Employee e5 = new Employee(5, 29, "akash", "mahabubad", account);
		Employee e6 = new Employee(9, 20, "abhi", "manugonda", hr);
		Employee e7 = new Employee(54, 21, "harsh", "moodapally", ops);
		Employee e8 = new Employee(4, 21, "vineeth", "palakollu", ops);

		List<Employee> emp = Arrays.asList(e1, e2, e3, e4, e5, e6, e7, e8);
		System.out.println(emp);
		for (Employee employee : emp) {
			System.out.println(" Employee Id : " + employee.getEmpId() + " Employee Name " + employee.getName()
					+ " Addresss : " + employee.getAddress() + " Age : " + employee.getAge());
		}

		emp.stream().filter(n -> n.getAddress().equalsIgnoreCase("palakollu"))
				.sorted(Comparator.comparing(Employee::getName)).forEach(e -> System.out.println(e.getName()));

		emp.stream().map(e -> e.getDepartment().getDepartmentName()).distinct()
				.forEach(s -> System.out.println("Depart names " + s));

		emp.stream().map(m -> m.getDepartment().getNoOfEmployees()).distinct().forEach(s -> System.out.println(s));
		;

		// Print all employee’s name who are working for account department.

		System.out.println(">>>>>>>>>>>>>SAme type <<<<<<<<<<<<<");
		emp.stream().filter(n -> n.getDepartment().getDepartmentName().equalsIgnoreCase("account"))
				.map(Employee::getName).forEach(System.out::println);

		// What is the highest number of of employees in all departments?
		emp.stream().map(n -> n.getDepartment().getNoOfEmployees()).reduce(Integer::max).ifPresent(System.out::println);
		System.out.println(">>>>>>>>>>><<<<<<<");
		// print all the employees in all departments.
		emp.stream().map(e -> e.getDepartment().getNoOfEmployees()).reduce(Integer::sum)
				.ifPresent(s -> System.out.println(s));

		// Print the name of all departments in the organization?
		emp.stream().map(Employee::getDepartment).distinct().forEach(i -> System.out.println(i.getDepartmentName()));

		Map<Department, Long> map = emp.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
		System.out.println(">>>>>>>>> map<<<<<<<<<<<<<<<" + map);

		List<Employee> e12 = emp.stream().filter(n -> n.getName().equals("vineeth")).collect(Collectors.toList());

		for (Employee eee : e12) {
			System.out.println("" + eee.toString());
		}

	}

}
