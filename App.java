import java.util.Scanner;

public class App {
public static void main(String[] args) {

Scanner input = new Scanner(System.in);

//instansiasi objek bernama m1
    Mobil m1 = new Mobil();
    m1.setKecepatan(50);
    m1.setWarna("Merah");

    System.out.print("Masukkan Merk Mobil 1: ");
        m1.setMerk(input.nextLine());

    System.out.print("Masukkan Plat Nomor Polisi Mobil 1: ");
        m1.setNopol(input.nextLine());

    System.out.print("Masukkan Jarak Tempuh Mobil 1 (km): ");
        m1.setJarakTempuh(input.nextDouble());

    System.out.print("Masukkan Waktu Tempuh Mobil 1 (jam): ");
        m1.setWaktuTempuh(input.nextDouble());

    m1.display();
    System.out.println("---------------");

//instansiasi objek bernama m2
    Mobil m2 = new Mobil();
    m2.setKecepatan(100);
    m2.setWarna("Biru");

    System.out.print("Masukkan Merk Mobil 2: ");
        m2.setMerk(input.nextLine());

    System.out.print("Masukkan Plat Nomor Polisi Mobil 2: ");
        m2.setNopol(input.nextLine());

    System.out.print("Masukkan Jarak Tempuh Mobil 2 (km): ");
        m2.setJarakTempuh(input.nextDouble());

    System.out.print("Masukkan Waktu Tempuh Mobil 2 (jam): ");
        m2.setWaktuTempuh(input.nextDouble());

    m1.hitungjarakTempuhMPS();
    m2.hitungjarakTempuhMPS();

    m2.display();
    System.out.println("---------------");
    System.out.println("Atribut pada objek m1 diubah.");

//mengubah warna dari objek m1
    m1.setWarna("Hijau");

//menampilkan hasil perubahan
    m1.display();
    }
}