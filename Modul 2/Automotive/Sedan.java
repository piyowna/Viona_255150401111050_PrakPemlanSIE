public class sedan extends car {
    public int numDoors = 3; 
        sedan() { 
            System.out.println("Sedan is created"); 
        } 
    public void trunk() { 
        System.out.println("Sedan is opening trunk"); 
    } 
    public void honk() { 
        super.honk();
        System.out.println("Sedan is honking"); 
    } 
    public void getNumWheels() { 
        System.out.println("Sedan has " + numWheel + " wheels"); 
    } 
}


