package example;

public class Dog {
	 private int size;
	 String name;
	 int age;
	 int dis;
	 
	 public int getSize() {
		return size;
	}
	 
	public void setSize(int size) {
		this.size = size;
	}
	 
	 private int move(int dis) {
		 this.dis = this.dis + dis;
		 return dis;
	 }
}