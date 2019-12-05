import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		// union-find ������ �̿��� <���μ�����>�� ǥ�����: {0,1}, {2,3,4}, {5,6,7,8}, {9}
		// ��� ���Ͽ������յ��� ���� �� union(������) ������ ����
		int N = 10;
		UF uf = new UF(N); // ���Ͽ������յ� ����: {0},{1},{2},{3},...,{N}
		System.out.println(uf);
		uf.union(0, 1); // 0->1
		uf.union(2, 3); // 2->3
		uf.union(3, 4); // 2->3->4
		uf.union(5, 6); // 5->6
		uf.union(6, 7); // 5->6->7
		uf.union(7, 8); // 5->6->7->8
		System.out.println(uf);

		System.out.println(uf.find(5) == uf.find(7)); // find ���� ���� ��� ���� ���� �˻�
		System.out.println(uf.find(5) == uf.find(2)); // find ���� ���� ��� ���� ���� �˻�
		uf.union(4, 5);
		System.out.println(uf);
	}
}

public class UF {
	int parent[];

	public UF(int N) {
		parent = new int[N];
		for (int i = 0; i < parent.length; i++)
			parent[i] = i;
	}

	public void union(int i, int j) {
		i = find(i);
		j = find(j);
		if (i == j)
			return;
		parent[i] = j;
	}

	public int find(int i) {
		while (i != parent[i])
			i = parent[i];
		return i;
	}

	@Override
	public String toString() {
		return Arrays.toString(parent);
	}
}