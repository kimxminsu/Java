import java.util.Arrays;

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