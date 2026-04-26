public class Node {
        String data; //Diubah String
        Node left, right;
        Node(String data) { // DIubah String
            this.data = data;
        }
    public void add(String data) { //Diubah string
        if (data.compareTo(this.data) > 0) { // Diubah jadi Compareto
            if (this.right == null) {
                this.right = new Node(data);
            } else this.right.add(data);
        }
        if (data.compareTo(this.data) < 0) { //Diubah jadi Compareto
            if (this.left == null) {
                this.left = new Node(data);
            } else this.left.add(data);
        }
    }
}
