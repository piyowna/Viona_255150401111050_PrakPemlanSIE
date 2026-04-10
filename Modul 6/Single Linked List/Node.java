public class Node { 
    Object data; 
    Node next;
    Node prev;
    
    Node() {
        this.data = null;
    }
    
    Node(Object data) {
        this.data = data;
    }
    
    @Override
    public String toString() {
        return data != null ? data.toString() : "null";
    }
    
    public static void main(String[] args) {
        Node node1 = new Node("A");

        System.out.println("node : " + node1);
        System.out.println("data : " + node1.data);
        System.out.println("next : " + node1.next); 
    }   
    
}
