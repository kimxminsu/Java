public class Test {
	public static void main(String[] args) {
		String s = "South, Korea 안녕"; //문자열로 하려면 string buffer쓰면됨
		char v[] = s.toCharArray();
		toUpper(v, 0);
		System.out.println(v);
	}

	private static void toUpper(char[] v, int i) {
		//i번째만 바꾸고 다음부터 i+1부터는 재귀호출
		
		if(i==v.length) return; //마지막 위치 도달, v.length-1 하면 변환해야되니까 마지막위치 다음에 이르면 몽드ㅜㄴ위치 검사,변환 됐으니까 할일 없어서 return
		
//		if(i==v.length-1) {
//			//검사 한번더해야됨
//		}
		if(v[i]>='a'&&v[i]<='z') v[i]+='A'-'a'; //소문자->대문자
		toUpper(v, i+1); //i값이 계속 증가
		
	}
}