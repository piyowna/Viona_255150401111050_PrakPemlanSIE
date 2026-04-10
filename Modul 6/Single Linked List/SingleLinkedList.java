public class SingleLinkedList {
    Node head, tail;
    int size = 0;

    void init() { head = null; }
    boolean isEmpty() { return size == 0; }
    int size() { return size; }

    void addFirst(Node data) {
    if (isEmpty()) {
        head = data;
        tail = data;
    } else {
        data.next = head;
        head = data;
    }
        size++;
    }

    void addLast(Node data) {
    if (isEmpty()) {
        head = data;
        tail = data;
    } else {
        tail.next = data;
        tail = data;
    }
        size++;

    }

    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        
        System.out.println("Head : " + list.head);
        System.out.println("Tail : " + list.tail);

        list.addFirst(new Node("A"));
        System.out.println("Head : " + list.head);
        System.out.println("Tail : " + list.tail);

        list.addLast(new Node("B"));
        System.out.println("Head : " + list.head);
        System.out.println("Tail : " + list.tail);

        list.addFirst(new Node("C"));
        System.out.println("Head : " + list.head);
        System.out.println("Tail : " + list.tail);
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
    Node cariUrutan(int posisi) {
        if (posisi < 0 || posisi >= size) return null;
        Node bantu = head;
        for (int i = 0; i < posisi; i++) {
            bantu = bantu.next;
        }
        return bantu;
    }

    // 3. Menghapus node di posisi (index) ke-n
    void hapusDi(int posisi) {
        if (posisi < 0 || posisi >= size) return;
        if (posisi == 0) {
            head = head.next;
            if (size == 1) tail = null;
        } else {
            Node sebelum = cariUrutan(posisi - 1);
            sebelum.next = sebelum.next.next;
            if (posisi == size - 1) tail = sebelum;
        }
        size--;
    }

    // 4. Menghapus node dengan nilai data tertentu
    void hapusData(Object target) {
        if (isEmpty()) return;
        if (head.data.equals(target)) {
            hapusDi(0);
            return;
        }
        Node bantu = head;
        while (bantu.next != null) {
            if (bantu.next.data.equals(target)) {
                if (bantu.next == tail) tail = bantu;
                bantu.next = bantu.next.next;
                size--;
                return;
            }
            bantu = bantu.next;
        }
    }

    // 5. Menambah node di posisi (index) ke-n
    void tambahDi(int posisi, Node baru) {
        if (posisi < 0 || posisi > size) return;
        if (posisi == 0) addFirst(baru);
        else if (posisi == size) addLast(baru);
        else {
            Node sebelum = cariUrutan(posisi - 1);
            baru.next = sebelum.next;
            sebelum.next = baru;
            size++;
        }
    }

    // 6. Menambah node setelah node dengan nilai tertentu
    void sisipSetelah(Object target, Node baru) {
        Node ketemu = cariData(target);
        if (ketemu != null) {
            baru.next = ketemu.next;
            ketemu.next = baru;
            if (ketemu == tail) tail = baru;
            size++;
        }
    }

    // 7. Menambah node sebelum node dengan nilai tertentu
    void sisipSebelum(Object target, Node baru) {
        if (isEmpty()) return;
        if (head.data.equals(target)) {
            addFirst(baru);
            return;
        }
        Node bantu = head;
        while (bantu.next != null) {
            if (bantu.next.data.equals(target)) {
                baru.next = bantu.next;
                bantu.next = baru;
                size++;
                return;
            }
            bantu = bantu.next;
        }
    }

    // Buat ngecek hasil
    void tampilkan() {
        Node bantu = head;
        while (bantu != null) {
            System.out.print(bantu.data + (bantu.next != null ? " -> " : ""));
            bantu = bantu.next;
        }
        System.out.println(" (Total: " + size + ")");
    }

    public static void main1(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        
        list.addFirst(new Node("A"));
        list.addLast(new Node("B"));
        list.addFirst(new Node("C"));

        // Cukup panggil satu baris ini saja untuk melihat semua isinya
        list.tampilkan(); 
    }

}
