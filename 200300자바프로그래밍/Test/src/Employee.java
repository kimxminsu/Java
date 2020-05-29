public class Employee {
	String id;
	double monthlyPayBase = 250; // �⺻ �� �޿��� 250����

	public Employee(String id) {
		this.id = id;
	}

	public Employee(String id, int monthlyPayBase) {
		this.id = id;
		this.monthlyPayBase = monthlyPayBase;
	}

	public double getMonthlyPay() {
		return monthlyPayBase;
	}
}