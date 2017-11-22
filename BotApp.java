
import java.util.*;
import javax.swing.JOptionPane; 


public class BotApp extends BotAnimal {
   static String playerreply;
   static String playername;
   static String animalletter;
   static String reply1;
   static String reply2;
   static String reply3;
   static String reply4;
   static String reply5;
   static String reply6, reply7, reply8;
   static String reply9, reply10, reply11;
   static String reply12, reply13, reply14;
   static String reply15, reply16, reply17;
    
    // public static void see(){

    //    System.out.print("THis is a sample using another class"); 
    // }

    public static void PlayerId() {
        
        
            
            
            Scanner input = new Scanner(System.in);
        
            playername  = JOptionPane.showInputDialog(null, "PLEASE TYPE IN YOUR NAME.");
            if (playername.equals("")){
                JOptionPane.showInputDialog(null, "HEY YOUR NAME IS NOT SUPPOSE TO BE EMPTY PLEASE \n ");
                // playername  = JOptionPane.showInputDialog("PLEASE TYPE IN YOUR NAME ?");
            }else{

        
            // converting the name of the player to uppercase
            playername = playername.toUpperCase();
            JOptionPane.showMessageDialog(null, "HEY NICE TO MEET YOU " + playername + "\n WELL I AM A BOT. \n BUT YOU CAN CALL ME THE GUSSER.\n");
        
            }            
                       
    } 

  public static void PlayerOptions() {

        Scanner input = new Scanner(System.in);


    playerreply = JOptionPane.showInputDialog("WOULD YOU LIKE TO PLAY A GAME WITH ME \n");

    // for (playerreply == "yes"){}
    if (playerreply.equals("yes")){

        JOptionPane.showMessageDialog(null, "WOW NICE ONE!!!!! \n THINK OF AN ANIMAL AND DON'T TELL WHAT THE ANIMAL IS I WILL \n BUT FIRST ANSWER SOME QUESTIONS.");
        
    }else if(playerreply.equals("no")){
        JOptionPane.showInputDialog("AM VERY SURE YOU WILL LIKE THIS GAME \n PLEASE JUST TRY. ");


    }else {
        JOptionPane.showInputDialog("PLESE USE VALID SYNTEX" );


    }


}   



    public static void PlayerNameClass(){
        
    Scanner input = new Scanner(System.in);
    BotAnimal abt = new BotAnimal();
       
    animalletter = JOptionPane.showInputDialog("WHAT IS THE FIRST LETTER OF THE ANIMAL PLEASE ?");


            animalletter = animalletter.toLowerCase();

              /*calling a method in side the class
               BotAnimal IF THE USER INPUT IS = ONE OF THE OPTIONS BELOW  */
            if(animalletter.equals("a")){
              
                
                abt.allBotAnimal(); 

             }else if(animalletter.equals("y")){
                abt.allYinimalYak();
            }else if(animalletter.equals("n")){
              abt.allNimalNilgai();
            }
            
    
}


public static void allBotApp(){

    PlayerId();

    PlayerOptions();

    PlayerNameClass();

}

}


