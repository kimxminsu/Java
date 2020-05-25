
public class YMD {
	int year, month, day;

	public YMD() {

	}

	public YMD(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public String toString() {
		return year + "³â" + month + "¿ù" + day + "ÀÏ";
	}

}
