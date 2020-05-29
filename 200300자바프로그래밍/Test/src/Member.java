
public class Member {
	private String email, joinDate;

	public Member(String email, String joinDate) {
		this.email = email;
		this.joinDate = joinDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getJoinDate() {
		int date = Integer.parseInt(joinDate);
		return date;
	}

	public int getJoinYear() {
		int year = Integer.parseInt(joinDate.substring(0, 4));
		return year;
	}

	@Override
	public String toString() {
		return email + ", " + joinDate;
	}

}
