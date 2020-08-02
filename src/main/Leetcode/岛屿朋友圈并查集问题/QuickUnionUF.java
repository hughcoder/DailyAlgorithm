package main.Leetcode.岛屿朋友圈并查集问题;

public class QuickUnionUF {
    private int[] roots;

    public QuickUnionUF(int n) {
        roots = new int[n];
        for (int i = 0; i < n; i++) {
            roots[i] = i;
        }
    }

    private int findRoot(int i) {
        int root = i;
        while (root != roots[root]) {
            root = roots[root];
        }
        while (i != roots[i]) {
            int tmp = roots[i];
            roots[i] = root;
            i = tmp;
        }

        return root;
    }

    public boolean connected(int p, int q) {
        return findRoot(p) == findRoot(q);
    }

    public void union(int p, int q) {
        int qroot = findRoot(q);
        int proot = findRoot(p);
        roots[proot] = qroot;
    }


    public static void main(String args[]) {
        QuickUnionUF quickUnionUF = new QuickUnionUF(4);
        int a = quickUnionUF.findRoot(2);
        System.out.println(a);
        System.out.println(quickUnionUF.findRoot(3));
        quickUnionUF.union(2,3);
        System.out.println(quickUnionUF.findRoot(2));
        System.out.println(quickUnionUF.findRoot(3));
    }
}
