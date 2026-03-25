public class Student {
 private String nama; 
 private int skor; 
  
 public Student(String nama) { 
    this.nama = nama; 
 } 
 private void setNama(String nama) { 
    this.nama = nama; 
 } 
 public static void setNama(Student std, String nama) {
    std.setNama(nama);
 }
 public void modifyNama(String nama) { 
    setNama(nama); 
 }

 public int getSkor() { 
    return this.skor; 
 } 
 public String getNama(){
    return this.nama;
 }

}

