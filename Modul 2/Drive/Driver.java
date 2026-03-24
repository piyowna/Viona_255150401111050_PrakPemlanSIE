public class Driver {
    car coupe = new car();

    public Driver() { 
        System.out.println("Driver is created."); 
    } 
    
    public void driving() { 
        System.out.println("Driver is driving."); 
        System.out.println("Using a car that has " + coupe.numWheel + " wheels.");  } 
}
