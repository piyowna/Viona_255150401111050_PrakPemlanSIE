public class AmongUsGame {
public static void main(String[] args) { 

 // Create references of Character 
Character brian, cindy, david, jacky; 

brian = new Crew("Brian"); 
cindy = new Crew("Cindy"); 
david = new Crew("David"); 

jacky = new NonPlayableChar("Jacky");

brian.doWork(); 
cindy.doWork(); 
david.doWork(); 
jacky.doWork(); 

Impostor impostor = new Impostor(jacky); 
impostor.kill(cindy);  
  
    if (david instanceof Crew crew) {
        crew.callMeeting(); 
    }
    AmongUsGame.check(brian); 
    AmongUsGame.check(david); 
    AmongUsGame.check(jacky); 
} 
    public static void check(Character ch) { 
        if (AmongUsGame.isImpostor(ch)) 
            System.out.println(ch.name + " is the impostor!"); 
        else 
            System.out.println(ch.name + " is not the impostor."); 
    } 
    public static boolean isImpostor(Character ch) { 
        return (ch instanceof Impostor); 
    } 
    
}
