public class AutomotiveApp {
    public static void main(String[] args) { 

    Vehicle vehicle = new Vehicle(); 
    car car = new car(); 
    sedan sedan = new sedan(); 
    
    vehicle.drive(); 
    car.drive(); 
    sedan.drive(); 

    System.out.println("-----------------"); 
    car.drift(); 
    sedan.drift(); 
    
    System.out.println("-----------------"); 
    car.honk(); 
    sedan.honk(); 
    System.out.println("-----------------"); 
    sedan.getNumWheels(); 
    } 
}

