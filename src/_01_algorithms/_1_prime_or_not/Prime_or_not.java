package _01_algorithms._1_prime_or_not;
import javax.swing.JOptionPane;
public class Prime_or_not {


	// TODO Auto-generated constructor stub
	public static void main(String [] args) {
		String numm = JOptionPane.showInputDialog("Enter  a number you are wondering whether or not it is prime.");


		int num = Integer.parseInt(numm);

		for(int i = num-1; i > 1;i --) {

			if(num % i == 0) {
				JOptionPane.showMessageDialog(null, numm+" is not prime");
				return;
			}
		}
		JOptionPane.showMessageDialog(null, "Your number is prime");







	}




}



