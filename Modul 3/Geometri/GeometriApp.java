public class Geometriapp { 
    public static void main(String[] args) { 
        Lingkaran2 lingKecil = new Lingkaran2(2.0f); 
        Lingkaran2 lingBesar = new Lingkaran2(11.0f); 
        float lK = lingKecil.luas(); 
        float lB = lingBesar.luas(); 
        System.out.println("Luas Lingkaran Kecil: " + lK); 
        System.out.println("Luas Lingkaran Besar: " + lB); 
    } 
}
