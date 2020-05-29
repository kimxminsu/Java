public class Player {
	String id;
	int record1, record2, record3;

	public Player(String id, int record1, int record2, int record3) {
		this.id = id;
		this.record1 = record1;
		this.record2 = record2;
		this.record3 = record3;
	}

	public double getAverage() {
		return (record1+record2+record3)/3;
	}
}