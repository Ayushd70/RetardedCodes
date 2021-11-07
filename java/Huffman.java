// Huffman Coding in Java

import java.util.Comparator;
import java.util.PriorityQueue;

class Huffman {
    int item;
    char c;
    Huffman left;
    Huffman right;
}

// For comparing the nodes
class ImplementComparator implements Comparator<Huffman> {
    public int compare(Huffman x, Huffman y) {
        return x.item - y.item;
    }
}

// Implementing the huffman algorithm
class HuffmanAlgo {
    public static void printCode(Huffman root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {

            System.out.println(root.c + "   |  " + s);

            return;
        }
        assert root.left != null;
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }

    public static void main(String[] args) {

        int n = 4;
        char[] charArray = {'A', 'B', 'C', 'D'};
        int[] charfreq = {5, 1, 6, 3};

        PriorityQueue<Huffman> q = new PriorityQueue<>(n, new ImplementComparator());

        for (int i = 0; i < n; i++) {
            Huffman hn = new Huffman();

            hn.c = charArray[i];
            hn.item = charfreq[i];

            hn.left = null;
            hn.right = null;

            q.add(hn);
        }

        Huffman root = null;

        while (q.size() > 1) {

            Huffman x = q.peek();
            q.poll();

            Huffman y = q.peek();
            q.poll();

            Huffman f = new Huffman();

            assert y != null;
            f.item = x.item + y.item;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;

            q.add(f);
        }
        System.out.println(" Char | Huffman code ");
        System.out.println("--------------------");
        assert root != null;
        printCode(root, "");
    }
}
