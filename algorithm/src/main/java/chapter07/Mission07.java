package chapter07;

import java.util.*;

public class Mission07 {

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

    public static List<String> solution(int n) {
        List<String> list = new ArrayList<>();

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        bfs(list, root);

        return list;
    }

    private static void bfs(List<String> list, Node node) {
        Deque<Node> q = new ArrayDeque<>();
        q.offer(node);
        while (!q.isEmpty()) {
            int size = q.size();
            StringBuilder data = new StringBuilder();
            for (int i = 0; i < size; i++) {
                Node poll = q.poll();
                assert poll != null;
                data.append(poll.data);
                data.append(" ");
                if (poll.left != null) {
                    q.offer(poll.left);
                }
                if (poll.right != null) {
                    q.offer(poll.right);
                }
            }
            list.add(data.toString().trim());
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        List<String> solution = Mission07.solution(7);
        for (String s : solution) {
            System.out.println(s);
        }
    }

}



