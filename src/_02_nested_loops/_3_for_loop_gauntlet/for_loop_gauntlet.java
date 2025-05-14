package _02_nested_loops._3_for_loop_gauntlet;

public class for_loop_gauntlet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b =0;
		
		for(int i = 0; i <= 9 ;i +=1) {
			for(int h = 0; h <=3;h++) {
			
			//System.out.println("in " +i+ " I was " +(i-2013)+" years old.");
			if(i % 3 == 0) {
			b = 0;
			}
			//System.out.print(b);
			//System.out.println(h);
			}
		}
	for(int o = 0; o <= 2; o++) {
		for(int e = 1; e <=3;e ++) {
			System.out.print(e+(3 * o));
		}System.out.println();
	}
	for(int r = 0; r <= 9; r++) {
		for(int t = 0; t <=10;t ++) {
			System.out.print((r*10)+ t+"   ");
		}System.out.println("");
	}
	
	
	for(int r = 6; r >= 1; r--) {
		for(int t =r; t <7;t++ ) {
			System.out.print("*");
		}System.out.println("");
	}
	
	
	
	
		}
	
	
	
	
	

	}


