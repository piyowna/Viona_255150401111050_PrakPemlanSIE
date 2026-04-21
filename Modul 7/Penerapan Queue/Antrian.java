import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Antrian { 
    public static void main(String[] args) { 
        Deque<String> queue = new LinkedList<>(); 
        Scanner sc = new Scanner(System.in); 
        
        while (true) { 
            System.out.println("---------------------------------");
            System.out.println("Menu Antrian Pelanggan:"); 
            System.out.println("1. Tambah Pelanggan"); 
            System.out.println("2. Layani Pelanggan"); 
            System.out.println("3. Tampilkan Antrian"); 
            System.out.println("4. Keluar"); 
            System.out.print("Pilih (1-4): "); 
            
            try { 
                int choice = sc.nextInt(); 
                sc.nextLine();
                
                switch (choice) { 
                    case 1: 
                        System.out.print("Masukan Nama Pelanggan: "); 
                        String name = sc.nextLine(); 
                        
                        //untuk Budi
                        if (name.equalsIgnoreCase("Budi")) {
                            queue.addFirst(name); 
                            System.out.println("Budi diprioritaskan ke depan antrian!");
                        } else {
                            queue.addLast(name);
                            System.out.println(name + " ditambahkan ke antrian.");
                        }
                        break; 
                    case 2: 
                        if (queue.isEmpty()) {
                            System.out.println("Antrian kosong."); 
                        } else { 
                            String nama = queue.poll(); 
                            System.out.println("Melayani pelanggan : " + nama); 
                        } 
                        break; 
                    case 3: // Tampilkan Antrian
                        if (queue.isEmpty()) { 
                            System.out.println("Tidak ada antrian"); 
                        } else { 
                            System.out.println("Antrian Saat Ini: " + queue); 
                        } 
                        break; 
                    case 4: 
                        System.out.println("Keluar."); 
                        sc.close(); 
                        return; 
                    }
            } catch(Exception e) { 
                System.out.println("Input tidak valid. Silakan masukkan angka."); 
                if (sc.hasNext()) sc.next(); 
            } 
        }
    } 
}
