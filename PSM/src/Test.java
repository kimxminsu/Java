import java.util.Random;

public class Test {
	public static void main(String[] args) {
		int R = 5, C = 5, count = 0;
		char ground[][] = new char[R][C];
		Random random = new Random();
		for (int i = 0; i < ground.length; i++) { // 임의 개수의 물웅덩이 포함 평면 생성
			for (int j = 0; j < ground[i].length; j++)
				ground[i][j] = (random.nextInt(3) == 0) ? '1' : '0';
		}
		for (int i = 0; i < ground.length; i++) { // 평면 출력
			for (int j = 0; j < ground[i].length; j++)
				System.out.print(ground[i][j]);
			System.out.println();
		}
		for (int i = 0; i < ground.length; i++) {
			for (int j = 0; j < ground[i].length; j++) {
				if (ground[i][j] == '1') {
					dfs(ground, R, C, i, j);
					count++;
				}
			}
		}
		System.out.println(count);
	}

	private static void dfs(char[][] ground, int R, int C, int i, int j) {
		ground[i][j] = '0';// 방문표시 (마른땅으로 변경)
		
		//[i][j]를 포함해서 불필요한 검사를 하긴 함(9번)
		
		for (int dx = -1; dx <= 1; dx++) { //dx=-1,0,1
			for(int dy=-1;dy<=1;dy++) {//dx=-1,0,1
				int r=i+dx,c=j+dy;
				if(r>=0&&r<R&&C>=0&&c<c&&ground[r][c]=='1') dfs(ground, R, C, r, c);
			}
		}

	}
}