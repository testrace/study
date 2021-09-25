package chapter07;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Mission09 {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int solution(int s) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        return dfs(0, root);
    }

    private static int dfs(int i, Node root) {
        if (root.left == null && root.right == null) {
            return i;
        }
        return Math.min(dfs(i + 1, root.left), dfs(i + 1, root.right));
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        int solution = Mission09.solution(s);
        System.out.println(solution);
    }

}



