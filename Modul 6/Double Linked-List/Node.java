public class Node {
    Object data;
    Node next, prev;
    Node() {
        this.next = null;
        this.prev = null;
    }
    Node(Object data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public static void main(String[] args) {
        Node nodeA = new Node("A");
        
        System.out.println("node : " + nodeA);
        System.out.println("data : " + nodeA.data);
        System.out.println("next : " + nodeA.next);
        System.out.println("prev : " + nodeA.prev);

        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        
        nodeA.next = nodeB;
        nodeB.prev = nodeA;
        nodeA.prev = nodeC;
        nodeC.next = nodeA;

        System.out.println("next data : " + nodeA.next.data);
        System.out.println("prev data : " + nodeA.prev.data);

    }
}

