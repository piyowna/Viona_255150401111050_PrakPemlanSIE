public class CustomQueue { 
    private Node head, tail; 
    private int size = 0; 
    
    public void enqueue(int x) { 
        Node n = new Node(x); 
        if (tail != null) tail.next = n; 
        tail = n; 
        if (head == null) head = tail; 
        size++; 
    } 

    public int dequeue() { 
        if (head == null) 
            throw new RuntimeException("Queue is empty."); 
        int val = head.data; 
        head = head.next; 
        if (head == null) tail = null; 
        size--; 
        return val; 
    }

    public boolean isEmpty() {
        return head == null;
    }

    // Method untuk menampilkan isi antrean dari depan ke belakang
    public void print() {
        Node bantu = head;
        System.out.print("Isi Queue: ");
        while (bantu != null) {
            System.out.print(bantu.data + " ");
            bantu = bantu.next;
        }
        System.out.println();
    }

    // Method untuk melihat elemen terdepan tanpa menghapusnya
    public int peek() {
        if (head == null)
            throw new RuntimeException("Queue is empty.");
        return head.data;
    }

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.enqueue(10);
        queue.enqueue(40);
        queue.enqueue(70);

        // Menampilkan isi queue sebelum peek
        System.out.print("Sebelum peek -> ");
        queue.print();

        // Memanggil fungsi peek
        System.out.println("Hasil peek: " + queue.peek());

        // Menampilkan isi queue sesudah peek
        System.out.print("Sesudah peek -> ");
        queue.print();
    }
}
