import java.io.*;
import java.util.*;

public class Main {

    static class DSU {
        int[] parent, size;

        DSU(int n) {
            parent = new int[n];
            size = new int[n];
            for (int i = 0; i < n; i++) {
                parent[i] = i;
                size[i] = 1;
            }
        }

        int find(int x) {
            if (parent[x] == x) return x;
            return parent[x] = find(parent[x]);
        }

        boolean union(int a, int b) {
            a = find(a);
            b = find(b);

            if (a == b) return false;

            if (size[a] < size[b]) {
                int t = a;
                a = b;
                b = t;
            }

            parent[b] = a;
            size[a] += size[b];
            return true;
        }
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int MAX = 1000000;

        int[] pos = new int[MAX + 1];
        Arrays.fill(pos, -1);

        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            pos[x] = i;
        }

        DSU dsu = new DSU(N);

        long ans = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for (int g = MAX; g >= 1; g--) {

            list.clear();

            for (int multiple = g; multiple <= MAX; multiple += g) {
                if (pos[multiple] != -1)
                    list.add(pos[multiple]);
            }

            if (list.size() <= 1)
                continue;

            int first = list.get(0);

            for (int i = 1; i < list.size(); i++) {
                if (dsu.union(first, list.get(i)))
                    ans += g;
            }
        }

        System.out.println(ans);
    }
}