package java8.features;

import java.util.ArrayList;
import java.util.List;

public class WithOutUsingStream {
	public static void main(String[] args) {
		List<Student> sts = new ArrayList<Student>();
		sts.add(new Student(1, "Vineeth", 23000));
		sts.add(new Student(2, "Ajay", 45000));
		sts.add(new Student(4, "pavan", 76000));
		sts.add(new Student(7, "Kalyan", 65000));

		List<Double> d = new ArrayList<Double>();
		for (Student s : sts) {
			System.out.println(s.id);
			if (s.salary < 30000) {
				d.add(s.salary);
			}
		}
		System.out.println(d);

		List<Double> usingStream = sts.stream().filter(x -> x.salary < 30000).map(x -> x.salary).toList();
		System.out.println(usingStream);

		for (int i = 1; i < 100; i++) {
			int count = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 1) {
				System.out.println(i);
			}
		}

	}

}
