public class DoubleLinkedList {
    Node head, tail;
    int size = 0;

    void init() { 
        head = null; 
        tail = null;
        size = 0;
    }
    boolean isEmpty() { return size == 0; }
    int size() { return size; }

    void addFirst(Node data) {
        if (isEmpty()) {
        head = data;
        tail = data;
        } else {
        data.next = head;
        head.prev = data;
        head = data;
        }
        size++;
    }

    void addLast(Node data) {
        if (isEmpty()) {
            head = data;
            tail = data;
        } else {
            data.prev = tail;
            tail.next = data;
            tail = data;
        }
        size++;
    }

    void print() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
    DoubleLinkedList list = new DoubleLinkedList();
    
    Node nodeA = new Node("A");
    Node nodeB = new Node("B");
    Node nodeC = new Node("C");

    list.addLast(nodeA);
    System.out.println("head : " + list.head.data);
    System.out.println("tail : " + list.tail.data);         
    list.addLast(nodeB);
    System.out.println("head : " + list.head.data);         
    System.out.println("tail : " + list.tail.data);
    list.addLast(nodeC);
    System.out.println("head : " + list.head.data);
    System.out.println("tail : " + list.tail.data);
    list.print();
    System.out.println("Next of B: " + nodeB.next.data);
    System.out.println("Prev of B: " + nodeB.prev.data);

    }

    // Method untuk menampilkan isi list dari belakang ke depan
    void cetakBerbalik() {
        // Kita mulai dari paling belakang (tail)
        Node bantu = tail; 
        
        System.out.print("Urutan Mundur: ");
        while (bantu != null) {
            System.out.print(bantu.data + " ");
            bantu = bantu.prev; 
        }
        System.out.println();
    }

    // 1. Mencari node dengan nilai tertentu
    Node cariData(Object target) {
        Node bantu = head;
        while (bantu != null) {
            if (bantu.data.equals(target)) return bantu;
            bantu = bantu.next;
        }
        return null;
    }

    // 2. Mencari node di posisi ke-n
    Node cariUrutan(int indeks) {
        if (indeks < 0 || indeks >= size) return null;
        Node bantu = head;
        for (int i = 0; i < indeks; i++) {
            bantu = bantu.next;
        }
        return bantu;
    }

    // 3. Menghapus node di posisi (index) ke-n
    void hapusDi(int indeks) {
        if (indeks < 0 || indeks >= size) return;
        if (indeks == 0) {
            head = head.next;
            if (head != null) head.prev = null;
            else tail = null;
        } else if (indeks == size - 1) {
            tail = tail.prev;
            if (tail != null) tail.next = null;
        } else {
            Node ketemu = cariUrutan(indeks);
            ketemu.prev.next = ketemu.next;
            ketemu.next.prev = ketemu.prev;
        }
        size--;
    }

    // 4. Menghapus node dengan nilai data tertentu
    void hapusData(Object target) {
        Node ketemu = cariData(target);
        if (ketemu == null) return;
        if (ketemu == head) hapusDi(0);
        else if (ketemu == tail) hapusDi(size - 1);
        else {
            ketemu.prev.next = ketemu.next;
            ketemu.next.prev = ketemu.prev;
            size--;
        }
    }

    // 5. Menambah node di posisi (index) ke-n
    void tambahDi(int indeks, Node baru) {
        if (indeks < 0 || indeks > size) return;
        if (indeks == 0) addFirst(baru);
        else if (indeks == size) addLast(baru);
        else {
            Node sesudah = cariUrutan(indeks);
            Node sebelum = sesudah.prev;
            baru.next = sesudah;
            baru.prev = sebelum;
            sebelum.next = baru;
            sesudah.prev = baru;
            size++;
        }
    }

    // 6. Menambah node setelah node dengan nilai tertentu
    void sisipSetelah(Object target, Node baru) {
        Node ketemu = cariData(target);
        if (ketemu == null) return;
        if (ketemu == tail) addLast(baru);
        else {
            baru.next = ketemu.next;
            baru.prev = ketemu;
            ketemu.next.prev = baru;
            ketemu.next = baru;
            size++;
        }
    }

    // 7. Menambah node sebelum node tertentu
    void sisipSebelum(Object target, Node baru) {
        Node ketemu = cariData(target);
        if (ketemu == null) return;
        if (ketemu == head) addFirst(baru);
        else {
            baru.prev = ketemu.prev;
            baru.next = ketemu;
            ketemu.prev.next = baru;
            ketemu.prev = baru;
            size++;
        }
    }
}
