import java.util.Arrays;

public class UF {
	int parent[], rank[], count;

	public UF(int N) {
		parent = new int[N];
		rank = new int[N];
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
		count = N; //2��-�ǽ� #1
	}

	public void union(int i, int j) { // union by rank
//		count--; //2��-�ǽ� #1 ���⿡ �ϸ� ���� ��쿡�� ���̴ϱ� ���⿡ �ϸ� �ȵ�
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
		count--; //2��-�ǽ� #1 union 1�� �Ҷ����� count�� 1�� �پ��� �װ� ������ �����ϴ� ����!
	}

	public int find(int i) { // path compression
//		if (i != parent[i])
//			parent[i] = find(parent[i]);
//		return parent[i];
		
//		2��-�ǽ� #2 - �̷��ڷῡ page5 find
//		while(i!=parent[i]) {
//			i=parent[i];
//		}
//		return i;
		
//		�������� ĥ�ǿ� ���ذ� �غ���
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