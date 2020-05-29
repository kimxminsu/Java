public class Employee {
	String id;
	double monthlyPayBase = 250; // 기본 월 급여액 250만원

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