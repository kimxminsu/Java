import java.util.Arrays;

public class UF {
	int parent[], rank[], count;

	public UF(int N) {
		parent = new int[N];
		rank = new int[N];
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
		count = N; //2번-실습 #1
	}

	public void union(int i, int j) { // union by rank
//		count--; //2번-실습 #1 여기에 하면 같은 경우에도 줄이니까 여기에 하면 안됨
		i = find(i);
		j = find(j);
		if (i == j)
			return;
		if (rank[i] < rank[j])
			parent[i] = j;
		else if (rank[i] > rank[j])
			parent[j] = i;
		else {
			parent[i] = j;
			rank[j]++;
		}
		count--; //2번-실습 #1 union 1번 할때마다 count가 1씩 줄어든다 그건 무조건 성립하는 조건!
	}

	public int find(int i) { // path compression
//		if (i != parent[i])
//			parent[i] = find(parent[i]);
//		return parent[i];
		
//		2번-실습 #2 - 이론자료에 page5 find
//		while(i!=parent[i]) {
//			i=parent[i];
//		}
//		return i;
		
//		교수님이 칠판에 써준거 해보기
		int root=0;
		while(i!=parent[i]) {
			int temp=parent[i];
			parent[i]=root;
			i=temp;
		}
		return root;
	}

	@Override
	public String toString() {
		return Arrays.toString(parent);
	}
}