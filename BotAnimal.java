import java.util.*;
import javax.swing.JOptionPane;



public class BotAnimal{

/*declaring the variables in such way for readability purpose.*/
	static String ant1;
    static String ant2;    
	static String ant3;
	static String ant4;
	static String correctant;
	static String correct;
    static String alligator1;
    static String alligator2;
    static String alligator3;
    static String alligator4;
    static String alligator5;
    static String correctalligator;
    static String antelop1;
    static String antelop2;
    static String antelop3;
    static String antelop4;
    static String antelop5;
	static String correctantelop;
	static String yak1;
    static String yak2;
    static String yak3;
    static String yak4;
    static String yak5;
    static String correctyak;
    static String nilgai1;
    static String nilgai2;
    static String nilgai3;
    static String nilgai4;
    static String nilgai5;
    static String correctnilgai;
    static String narwhal1;
    static String narwhal2;
    static String narwhal3;
    static String narwhal4;
    static String narwhal5;
    static String correctnarwhal;





	public static void AnimalAnt(){


		//to identify if the animal is an ant 

		ant1 = JOptionPane.showInputDialog(null, "IS THE ANIMAL TINY ?" );
		ant2 = JOptionPane.showInputDialog(null,  "THOSE THE ANIMAL WALKS VERY SLOW ?");
		ant3 = JOptionPane.showInputDialog(null,   "IS THE ANIMAL BLACK ?");
		ant4 = JOptionPane.showInputDialog(null, "IS T THE LAST LETTER OF THE ANIMALS NAME ? ");


		// converting user input to lower case to avoid errors

		ant1 = ant1.toLowerCase();
		ant2 = ant2.toLowerCase();
		ant3 = ant3.toLowerCase();
		ant4 = ant4.toLowerCase();
		
		// testing user input to finalize result (ant)


		// testing user input to finalize result (ant)
		if (ant1.equals("yes") && ant2.equals("yes") && ant3.equals("yes") && ant4.equals("yes") ){
			correctant = JOptionPane.showInputDialog(null, "HEY YOUR ANIMAL IS AN ANT TRUE OR FALSE ");

						// the if statment stating from line 28 - 32 is to now if the system quesses is true or false
						if (correct.equals("true")){
							JOptionPane.showMessageDialog(null, "IF THE ANIMAL IS AN ANT, I WON");
							System.exit(0);
						} else {
							JOptionPane.showMessageDialog(null, "IF THE ANIMAL IS NOT AN ANT, PLEASE DO ANSWER SOME MORE QUETIONS.");	
						}

					}
		// else {
		// 	JOptionPane.showMessageDialog(null, "LET RIDE ON !!...")
		// }

	}



	public static void AnimalAlligator(){

		//to identify if the animal is an ant 

 		alligator1 = JOptionPane.showInputDialog(null, "DOES THE ANIMAL STAY'S UNDERWATER ?" );
		alligator2 = JOptionPane.showInputDialog(null,  "THOSE THE ANIMAL KILL HUMANS ?");
		alligator3 = JOptionPane.showInputDialog(null,   "IS R THE  LAST ALPHABET OF THE ANIMAL NAME  ?");
		alligator4 = JOptionPane.showInputDialog(null, "IS T THE THIRD LETTER OF THE ANIMALS NAME ? ");
		alligator5 = JOptionPane.showInputDialog(null, "THOSE THE ANIMAL LOOKS LIKE AN EXTRA LARGE SIZE OF A LIZARD ?");

		// converting user input to lower case to avoid errors

		alligator1 = alligator1.toLowerCase();
		alligator2 = alligator2.toLowerCase();
		alligator3 = alligator3.toLowerCase();
		alligator4 = alligator4.toLowerCase();
		alligator5 = alligator5.toLowerCase();

		// testing user input to finalize result (alligator)

		if (alligator1.equals("yes") && alligator2.equals("yes") && alligator3.equals("yes") && alligator4.equals("yes") && alligator5.equals("yes") ){
			
			correctalligator = JOptionPane.showInputDialog(null, "HEY YOUR ANIMAL IS AN ALLIGATOR TRUE OR FALSE ");

						// the if statment stating from line 28 - 32 is to now if the system quesses is true or false
						if (correctalligator.equals("true")){
							JOptionPane.showMessageDialog(null, "IF THE ANIMAL IS AN ALLIGATOR, THEN I WON");
							System.exit(0);
						} else {
							JOptionPane.showMessageDialog(null, "IF THE ANIMAL IS NOT AN ALLIGATOR, PLEASE DO ANSWER SOME MORE QUETIONS.");	
						}


		}else {
			JOptionPane.showMessageDialog(null, "LET RIDE ON !!...");
		}

	}


	public static void AnimalAntelope(){
		//to identify if the animal is an ant 

 		antelop1 = JOptionPane.showInputDialog(null, "DOES THE ANIMAL HAS ANTILAS ?" );
		antelop2 = JOptionPane.showInputDialog(null,  "THOSE THE ANIMAL HAS FOR LEG ?");
		antelop3 = JOptionPane.showInputDialog(null,   "IS P THE  LAST ALPHABET OF THE ANIMAL NAME  ?");
		antelop4 = JOptionPane.showInputDialog(null, "IS E THE FOURTH LETTER OF THE ANIMALS NAME ? ");
		antelop5 = JOptionPane.showInputDialog(null, "THOSE THE ANIMAL RUNS FAST ?");

		//changing user input to ower case to avoid eerors of casing....
		antelop1 = antelop1.toLowerCase();
		antelop2 = antelop2.toLowerCase();
		antelop3 = antelop3.toLowerCase();
		antelop4 = antelop4.toLowerCase();
		antelop5 = antelop5.toLowerCase();

		// testing user input to finalize result (ant)
		if (antelop1.equals("yes") && antelop2.equals("yes") && antelop3.equals("yes") && antelop4.equals("yes") && antelop5.equals("yes") ){
			correctantelop = JOptionPane.showInputDialog(null, "HEY YOUR ANIMAL IS AN ANTELOPE  TRUE OR FALSE ");

						// the if statment stating from line 28 - 32 is to now if the system quesses is true or false
						if (correctalligator.equals("true")){
							JOptionPane.showMessageDialog(null, "IF THE ANIMAL IS AN ANTELOPE, THEN I WON");
							System.exit(0);
						} else {
							JOptionPane.showMessageDialog(null, "IF THE ANIMAL IS NOT AN ANTELOPE, PLEASE DO ANSWER SOME MORE QUETIONS.");	
						}


		}else {
			JOptionPane.showMessageDialog(null, "LET RIDE ON !!...");
		}

	}


	public static void allBotAnimal(){
		AnimalAnt();
		AnimalAlligator();
		AnimalAntelope();

	}
	



	/** ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 * THIS IS THE END OF ALL THE CODES IN RESPECT TO
	  UNDERSTANDING IF THE ANIMAL IS AN ANIMAL
	   THAT START WITH LETTER A
	 * 
	 * 
	 * 
	 * ----------------------------------------------------------
	 * THIS IS THE BIGINING OF ALL THE CODES
	  IN RESPECT TO UNDERSTANDING IF THE ANIMAL
	   START WITH LETER Y ..
	 */

	public static void YinimalYak(){

		//to identify if the animal is a yak 

		yak1 = JOptionPane.showInputDialog(null, "DOES THE ANIMAL HAS HORNS LIKE THAT OF A BULL ?" );
		yak2 = JOptionPane.showInputDialog(null,  "THOSE THE ANIMAL HAS FOR LEG ?");
		yak3 = JOptionPane.showInputDialog(null,   "THOSE THE ANIMAL HAS A TAIL  ?");
		yak4 = JOptionPane.showInputDialog(null, "IS K THE THIRD LETTER OF THE ANIMALS NAME ? ");
		yak5 = JOptionPane.showInputDialog(null, "IS THE ANIMAL NAME A THREE LETTER WORD ?");

		//changing user input to ower case to avoid eerors of casing....
		yak1 =  yak1.toLowerCase();
		yak2 = yak2.toLowerCase();
		yak3 = yak3.toLowerCase();
		yak4 = yak4.toLowerCase();
		yak5 = yak5.toLowerCase();

		// testing user input to finalize result (ant)
		if (yak1.equals("yes") && yak2.equals("yes") && yak3.equals("yes") && yak4.equals("yes") && yak5.equals("yes") ){
			correctyak = JOptionPane.showInputDialog(null, "HEY YOUR ANIMAL IS A YAK  TRUE OR FALSE ");

						// the if statment stating from line 28 - 32 is to now if the system quesses is true or false
						if (correctyak.equals("true")){
							JOptionPane.showMessageDialog(null, "IF THE ANIMAL IS A YAK, THEN I WON");
							System.exit(0);
						} else if {
							JOptionPane.showMessageDialog(null, "IF THE ANIMAL IS NOT A YAK, PLEASE DO ANSWER SOME MORE QUETIONS.");	
						}else {
							JOptionPane.showmessageDialog(null, "PLEASE USE A VALID SYNTEX");
						}


		}else {
			JOptionPane.showMessageDialog(null, "LET RIDE ON !!...");
		}

	}

	public static void allYinimalYak(){

		YinimalYak();
	}

	/** ---------------------------------------------------------------------------------------------------------------------------------------------------------------------
	 * THIS IS THE END OF ALL THE CODES IN RESPECT 
	 TO UNDERSTANDING IF THE ANIMAL IS AN ANIMAL THAT START WITH 
	 LETTER N
	 * 
	 * 
	 * 
	 * ----------------------------------------------------------
	 * THIS IS THE BIGINING OF ALL THE CODES IN RESPECT TO 
	  UNDERSTANDING IF THE ANIMAL START WITH LETER Y ..
	 */


public static void NinimalNilgai(){

		//to identify if the animal is a nilgai

		nilgai1 = JOptionPane.showInputDialog(null, "DOES THE ANIMAL FEEDS ON GRASS AND HERBS  ?" );
		nilgai2 = JOptionPane.showInputDialog(null,  "IS THE ANIMAL A MAMMAL ?");
		nilgai3 = JOptionPane.showInputDialog(null,   "THOSE THE ANIMAL HAS A TAIL  ?");
		nilgai4 = JOptionPane.showInputDialog(null, "IS L THE THIRD LETTER OF THE ANIMALS NAME ? ");
		nilgai5 = JOptionPane.showInputDialog(null, "IS THE ANIMAL NAME A SIX LETTER WORD ?");

		//changing user input to ower case to avoid eerors of casing....
		nilgai1 = nilgai1.toLowerCase();
		nilgai2 = nilgai2.toLowerCase();
		nilgai3 = nilgai3.toLowerCase();
		nilgai4 = nilgai4.toLowerCase();
		nilgai5 = nilgai5.toLowerCase();

		// testing user input to finalize result (ant)
		if (nilgai1.equals("yes") && nilgai2.equals("yes") && nilgai3.equals("yes") && nilgai4.equals("yes") && nilgai5.equals("yes") ){
			correctnilgai = JOptionPane.showInputDialog(null, "HEY YOUR ANIMAL IS A NILGAI  TRUE OR FALSE ");

						// the if statment stating from line 28 - 32 is to now if the system quesses is true or false
						if (correctnilgai.equals("true")){
							JOptionPane.showMessageDialog(null, "IF THE ANIMAL IS A NILGAI, THEN I WON");
							System.exit(0);
						} else if {
							JOptionPane.showMessageDialog(null, "IF THE ANIMAL IS NOT A NILGAI, PLEASE DO ANSWER SOME MORE QUETIONS.");	
						}else {
							JOptionPane.showmessageDialog(null, "PLEASE USE A VALID SYNTEX");
						}


		}else {
			JOptionPane.showMessageDialog(null, "LET RIDE ON !!...");
		}

	}



public static void NinimalNarwhal(){

		//to identify if the animal is a NARWHAL

		narwhal1 = JOptionPane.showInputDialog(null, "IS THE ANIMAL MOSTLY CLASSIFY AS A FISH  ?" );
		narwhal2 = JOptionPane.showInputDialog(null,  "THOSE THE ANIMAL HAS FINS?");
		narwhal3 = JOptionPane.showInputDialog(null,   "THOSE THE ANIMAL LEAVE IN WATER  ?");
		narwhal4 = JOptionPane.showInputDialog(null, "IS R THE THIRD LETTER OF THE ANIMALS NAME ? ");
		narwhal5 = JOptionPane.showInputDialog(null, "IS THE ANIMAL NAME A SEVEN (7) LETTER WORD ?");

		//changing user input to ower case to avoid eerors of casing....
		narwhal1 = narwhal1.toLowerCase();
		narwhal2 = narwhal2.toLowerCase();
		narwhal3 = narwhal3.toLowerCase();
		narwhal4 = narwhal4.toLowerCase();
		narwhal5 = narwhal5.toLowerCase();

		// testing user input to finalize result (ant)
		if (narwhal1.equals("yes") && narwhal2.equals("yes") && narwhal3.equals("yes") && narwhal4.equals("yes") && narwhal5.equals("yes") ){
			correctnarwhal = JOptionPane.showInputDialog(null, "HEY YOUR ANIMAL IS A NARWHAL  TRUE OR FALSE ");

						// the if statment stating from line 28 - 32 is to now if the system quesses is true or false
						if (correctnarwhal.equals("true")){
							JOptionPane.showMessageDialog(null, "IF THE ANIMAL IS A NARWHAL, THEN I WON");
							System.exit(0);
						} else if {
							JOptionPane.showMessageDialog(null, "IF THE ANIMAL IS NOT A NARWHAL, PLEASE DO ANSWER SOME MORE QUETIONS.");	
						}else {
							JOptionPane.showmessageDialog(null, "PLEASE USE A VALID SYNTEX");
						}


		}else {
			JOptionPane.showMessageDialog(null, "LET RIDE ON !!...");
		}

	}


	public static void allNinimalNilgai(){

		NinimalNilgai();
		NinimalNarwhal();
	}
		
	}



