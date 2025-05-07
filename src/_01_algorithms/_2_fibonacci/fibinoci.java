package _01_algorithms._2_fibonacci;

public class fibinoci {

	public static void main(String [] args) {
		// TODO Auto-generated constructor stub
		int num1 = 0;
		int num2 = 1;
		System.out.println(num1);
		System.out.println(num2);
		for(int i = 1; i < 30; i++ ) {
			if(i % 2==0) {
		num1 = num1 + num2;
		System.out.println(num1);
			}else if(i%2==1) {
				num2 = num1 + num2;
				System.out.println(num2);
			}
			
		
		
		
		}
		
	}

}
