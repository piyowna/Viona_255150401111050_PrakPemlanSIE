public class Crew implements ICrew { 

    private final String name;
    private boolean isAlive; // Menambahkan atribut status

    public Crew(String name) {
        this.name = name;
        this.isAlive = true; // Status awal adalah hidup
    }
  
    // Metod untuk mengubah status menjadi mati
    public void setKilled() {
        this.isAlive = false;
    }

    public void callMeeting() {
        if (isAlive) {
            System.out.println(this.name + "found a corpse and calls a meeting. Let's find the impostor!");
        } else {
            System.out.println(this.name + " udah dead, gak bisa meeting lagi euy!");
        }
    }

    @Override 
        public void doWork() { 
        System.out.println("Crew " + this.name + " is doing work."); 
    } 
    @Override 
        public String getName() { 
        return this.name; 
    } 

    @Override
    public void kick() {
        System.out.println(this.name + " was ejected from the spacecraft.");
    }

    public void setDead() {
        this.isAlive = false;
    }

    @Override
    public boolean isAlive() {
        return this.isAlive;
    }
}
