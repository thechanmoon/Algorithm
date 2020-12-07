class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = i;
        }
        int[] np = new int[n];
        for (int i = 0; i < n; i++) {
            if (leftChild[i] != -1) {
                union(p, i, leftChild[i]);
                np[leftChild[i]]++;
            }
            if (rightChild[i] != -1) {
                union(p, i, rightChild[i]);
                np[rightChild[i]]++;
            }
        }
        int noP = 0;
        for (int i = 0; i < n; i++) {
            if (np[i] == 0) {
                noP++;
            }
            if (noP > 1 || np[i] > 1) {
                return false;
            }
        }
        int groups = 0;
        for (int i = 0; i < n; i++) {
            if (p[i] == i) {
                groups++;
            }
        }
        return noP == 1 && groups == 1;
    }

    public void union(int[] p, int a, int b) {
        int pa = find(p, a);
        int pb = find(p, b);
        if (pa == pb) {
            return;
        }
        p[pa] = pb;
    }

    public int find(int[] p, int a) {
        if (p[a] == a) {
            return a;
        }
        return p[a] = find(p, p[a]);
    }
}