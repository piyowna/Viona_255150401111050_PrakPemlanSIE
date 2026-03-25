public class Lingkaran2 { 
    public static float PI = 3.14f; 
    public float r; 

    public Lingkaran2(float r) { 
    this.r = r; 
    } 

    public float luas() { 
        return Lingkaran2.PI * r * r;  
    } 

    public float keliling() {
        return 2 * Lingkaran2. PI * r;
    }

}

