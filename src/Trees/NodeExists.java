package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class NodeExists {
    public static boolean nodeExistsDFS (TreeNode root, TreeNode target) {
        if (root == null) {
            return false;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode currentNode = stack.pop();
            if (currentNode.val == target.val) {
                return true;
            }
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }
        }
        return false;
    }

    public static boolean nodeExistsBFS (TreeNode root, TreeNode target) {
        if (root == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if (currentNode.val == target.val) {
                return true;
            }
            if (currentNode.left != null) {
                queue.offer(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.offer(currentNode.right);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        /*
                  0
              1       2
           3   4     5   6
         */

        System.out.println(nodeExistsDFS(root, new TreeNode(9))); //false
        System.out.println(nodeExistsDFS(root, new TreeNode(5))); //true

        System.out.println(nodeExistsBFS(root, new TreeNode(9))); //false
        System.out.println(nodeExistsBFS(root, new TreeNode(5))); //true

    }

    public static void printTreeLevel (TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; ++i) {
                TreeNode currentNode = queue.poll();
                System.out.print(currentNode.val +" ");
                if (currentNode.left != null) {
                    queue.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.offer(currentNode.right);
                }
            }
            System.out.println();
        }
    }
}
