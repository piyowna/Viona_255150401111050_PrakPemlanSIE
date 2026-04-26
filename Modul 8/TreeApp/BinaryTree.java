import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
Node root;

public void add(String data) { //Diubah String
    if (root == null) {
        root = new Node(data);
    return;
    }
        root.add(data);
}

//Method Nomer 5
private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        // Rumus: 1 (nilai saat ini) + jumlah di kiri + jumlah di kanan
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

// Method Nomor 6
private int countLeaves(Node node) {
        if (node == null) return 0;
        if (node.left == null && node.right == null) return 1;
        return countLeaves(node.left) + countLeaves(node.right);
    }

// Method Nomor 7
    private int getHeight(Node node) {
        if (node == null) return -1; 
        
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        
        // Pilih jalur yang paling panjang
        return Math.max(leftHeight, rightHeight) + 1;
    }

private void inTraverse(Node node) {
    if (node == null) return;
        inTraverse(node.left);
            System.out.printf("[%s]", node.data);
        inTraverse(node.right);
}

public void levelTraverse(Node node) {
    if (node == null) return;

    // Queue untuk menyimpan 
    Queue<Node> queue = new LinkedList<>();
    queue.add(node);

    while (!queue.isEmpty()) {
        Node current = queue.poll();
        System.out.printf("[%s]", current.data);

        if (current.left != null) queue.add(current.left);
        if (current.right != null) queue.add(current.right);
    }
}

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.add("Mangga"); //Data diubah jad string nama buah
        tree.add("Apel");
        tree.add("Pisang");
        tree.add("Jeruk");
        
        System.out.println("Hasil Traversal:");
        System.out.println("-------------------------------------------------");
        System.out.print("Inorder : "); tree.inTraverse(tree.root);
        System.out.println();

        // Memanggil method countNodes
        int jumlahNode = tree.countNodes(tree.root);
        System.out.println("Banyaknya node di dalam Binary Tree: " + jumlahNode);

        // Memanggil method countLeaves
        int jumlahDaun = tree.countLeaves(tree.root);
        System.out.println("Banyaknya daun di dalam Binary Tree: " + jumlahDaun);

        // Memanggil method getHeight
        int tinggiTree = tree.getHeight(tree.root);
        System.out.println("Tinggi dari Binary Tree: " + tinggiTree);
        

        // Demo Nomor 9
        System.out.print("Level Order : "); tree.levelTraverse(tree.root);
        System.out.println();
    }
}
