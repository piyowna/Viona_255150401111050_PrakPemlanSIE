public class Impostor implements IImpostor, ICrew { 
    private final String name; 
    public Impostor(String name) { 
        this.name = name; 
    } 
    @Override 
    public void kill(ICrew crew) { 
        System.out.println(crew.getName() + " has been killed!"); 
        if (crew instanceof Crew) {
            ((Crew) crew).setKilled(); // Menandai bahwa crew sudah mati
        }
    }
    @Override 
    public void doWork() { 
        System.out.println("Impostor " + this.name + " is doing work."); 
    } 
    @Override 
    public String getName() { 
        return this.name; 
    } 
 
    @Override
    public void kick() {
        System.out.println("Impostor " + this.name + " was kicked.");
    }

    @Override
    public void setDead() {
        // Impostor can be marked as dead
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
