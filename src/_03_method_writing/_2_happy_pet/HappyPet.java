package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happienessLevel = 0;
	public static void main(String[] args) {
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String pet = JOptionPane.showInputDialog("What pet do your want.");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while(happienessLevel < 100) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Your pet isn't happy enough .What do you want to do to make your new pet happy. ", "Title", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Pet", "Play", "Feed" }, null);

			// 6. Use user input to call the appropriate method created in step 5 below.
			if(task == 0) {
				pet();
			} else if( task == 1) {
				play();
			}
			if(task == 2) {
				feed();
			}
			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		}
		JOptionPane.showMessageDialog(null, "Yay! your pet is happy enough.");
	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void pet() {
		happienessLevel += 5;
	}
	public static void play() {
		happienessLevel += 15;
	}
	public static void feed() {
		happienessLevel += 30;
	}
}