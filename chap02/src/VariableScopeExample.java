package sec06.exam01;

public class VariableScopeExample {
	public static void main(String[] args) {
		int v1 - 15;
		if(v1>10) {
			int v2 = v1 - 10; ///if블록 안에서 v2를 선언했기 때문에 if블록 안에서만 사용 가능
		}
		int v3 = v1 + v2 + 5; //v2 변수를 사용할 수 없기 때문에 컴파일 에러가 생김
	}
}
