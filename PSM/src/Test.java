public class Test {
	public static void main(String[] args) {
		int n[]= {5,1,8,3,2};
		System.out.println(max(n,n.length-1)); //i부터 끝까지
	}

	private static int max(int[] n, int i) {
		if(i==0) return n[i];
		System.out.println(n[i]);
		int v=max(n, i-1);
		System.out.println("??");
		System.out.println(n[i]);
		System.out.println(v);
		System.out.println("????");
		return n[i]>v? n[i] : v;
	}


}