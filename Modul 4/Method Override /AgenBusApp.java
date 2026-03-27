
public class AgenBusApp { 
    public static void main(String[] args) { 
    Tiket t1 = new TiketBus(); 
    t1.pesan(); 
    t1.tampil(); 

    TiketBus t2 = new TiketBus(); 
    t2.pesan(); 
    t2.tampil(); 
    
    TiketBus t3 = new TiketBus(); 
    t3.pesan("Kasino", "Bandung", 650, 450000); 
    t3.tampil();  
    t2.pesan("Indro", "Makassar"); 
    t2.tampil(); 
    
    t2.pesan("Dono", "Makassar"); 
    t2.tampil(); 

    TiketBus t4 = new TiketBus();
    t4.pesan("Viona Putri Maghfiroh"); //input baru dengan satu parameter
    t4.tampil();
    
    TiketBus tnew = new TiketBus() {
        @Override
        public void tampil() {
            System.out.println("====== TIKET BUS VIP CLASS =====");
            System.out.println("Penumpang : " + this.namaPenumpang);
            System.out.println("Tujuan    : " + this.tujuan);
            System.out.println("Jarak     : " + this.jarakTempuh + " km");
            System.out.println("Harga     : Rp " + this.hargaTiket);
            System.out.println("============================");
        }
    };

    tnew.pesan("Pio", "Bogor", 300, 410000);
    tnew.tampil();
    } 
}
