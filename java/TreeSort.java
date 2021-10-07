public class TreeSort {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static class BST {
        static Node root = null;

        public static Node insert(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }

            if (data < root.data)
                root.left = insert(root.left, data);
            else if (data > root.data)
                root.right = insert(root.right, data);
            return root;
        }

        public static void insertFromArray(int[] arr) {
            for (int j : arr) insertFromArr(j);
        }

        public static void insertFromArr(int data) {
            root = insert(root, data);
        }

        public static void inOrderRecursion(Node root) {
            if (root != null) {
                inOrderRecursion(root.left);
                System.out.print(root.data + " ");
                inOrderRecursion(root.right);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 7, 2, 11, 67, 888, 1, 3, 3, 88, 56};
        BST.insertFromArray(arr);
        BST.inOrderRecursion(BST.root);
    }
}
