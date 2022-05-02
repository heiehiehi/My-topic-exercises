package com.company;

public class 四节点数 {
    public Node construct(int[][] grid) {
        return construct(grid, 0, 0, grid.length);
    }

    private Node construct(int[][] grid, int sx, int sy, int l) {
        if (l == 1) {
            return new Node(grid[sx][sy] == 1, true);
        }
        l /= 2;
        Node tl = construct(grid, sx, sy, l);
        Node tr = construct(grid, sx, sy + l, l);
        Node bl = construct(grid, sx + l, sy, l);
        Node br = construct(grid, sx + l, sy + l, l);
        if (tl.isLeaf && tr.isLeaf && bl.isLeaf && br.isLeaf) {
            if (tl.val == tr.val && tr.val == bl.val && bl.val == br.val) {
                return new Node(tl.val, true);
            }
        }
        return new Node(false, false, tl, tr, bl, br);
    }
    public static void DFS(Node node,int[][] grid){

    }
    static class Node {
        public boolean val;
        public boolean isLeaf;
        public Node topLeft;
        public Node topRight;
        public Node bottomLeft;
        public Node bottomRight;


        public Node() {
            this.val = false;
            this.isLeaf = false;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = null;
            this.topRight = null;
            this.bottomLeft = null;
            this.bottomRight = null;
        }

        public Node(boolean val, boolean isLeaf, Node topLeft, Node topRight, Node bottomLeft, Node bottomRight) {
            this.val = val;
            this.isLeaf = isLeaf;
            this.topLeft = topLeft;
            this.topRight = topRight;
            this.bottomLeft = bottomLeft;
            this.bottomRight = bottomRight;
        }
    }
}
