public class TiketBus extends Tiket {

    @Override
    public void pesan() {
        this.tujuan = "Bandung";
    }

    public void pesan(String n) {  //Method baru dengan satu parameter
        this.namaPenumpang = n;
    }

    public void pesan(String n, String t) {
        this.namaPenumpang = n;
        this.tujuan = t;
        if (t.equals("Makassar")) {
            System.out.println("Maaf " + n + ", tiket tidak dapat dipesan.");
        }
    }

    @Override
    public void tampil() {
        if (!this.tujuan.equals("Makassar")) {
            super.tampil();
        } else {
            System.out.println("Nama Penumpang: " + this.namaPenumpang);
            System.out.println("Tiket tujuan Makassar tidak tersedia.");
            System.out.println("--------------------");
        }

    }
}
