package encapsulation.notEncapsulated;

public class Main {
    public static void main(String[] args) {


        /*Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        //We are able to acess these fields directly from the main class because we set the scope to public

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining  health = "+player.healthRemaining());

        damage = 11;

        player.loseHealth(damage);
        System.out.println("Remaining  health = "+player.healthRemaining()); */
       
        EnhancedPlayer player = new EnhancedPlayer("Tim", 50, "Sword");
        System.out.println("Initial health is "+ player.getHealth());
    
    }
    
}
