package constructorassignment;

public class Employee {

	public static void main(String[] args) {
		EmployeeGetterSetter e = new EmployeeGetterSetter(1, "Pooja", 12.55);
		System.out.println(e.getName());
		System.out.println(e.getId());
		System.out.println(e.getSalary());
//		e.setSalary(13.805);
//		System.out.println(e.getSalary());
		double f = e.getSalary();
		System.out.println(f);
		double hikePercentage = 10.0; // 10% hike
		double hikeAmount = (f * hikePercentage) / 100;
		double newSalary = f + hikeAmount;
		double setSalary = newSalary;
		System.out.println(setSalary);
	}

}
