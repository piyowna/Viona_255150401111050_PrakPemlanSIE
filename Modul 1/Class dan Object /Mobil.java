public class Mobil {
    private String nopol;
    private String warna;
    private String merk;
    private int kecepatan;
    private double jarak_tempuh;
    private double waktu_tempuh;
    public void setNopol(String n) {
    nopol = n;
    }
public void setWarna(String s) {
    warna = s;
    }
public void setMerk(String m) {
    merk = m;
    }
public void setKecepatan(int k) {
    kecepatan = k;
    }
public void setJarakTempuh(double j) {
    jarak_tempuh = j;
    }
public void setWaktuTempuh(double w) {
    waktu_tempuh = w;
    }

public void hitungjarakTempuhMPS() {
    jarak_tempuh = kecepatan * 1000.0/3600.0;
    }

public void display() {
    System.out.println("Mobil bermerk " + merk);
    System.out.println("bernomor polisi " + nopol);
    System.out.println("serta memililki warna " + warna);
    System.out.println("bergerak dengan kecepatan " + kecepatan + " kpj");
    System.out.println("jarak tempuh yang di capai adalah " + jarak_tempuh + " km");
    }
}
